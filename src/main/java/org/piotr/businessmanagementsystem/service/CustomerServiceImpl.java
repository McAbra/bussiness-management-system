package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    public Customer getCustomerByName(String name) throws NoSuchObjectException {
        Optional<Customer> customer = Optional.ofNullable(customerRepository.findCustomerByName(name));
        return customer.get();
    }

    public Optional<Customer> getCustomerByVATNumber(String vatNo) {
        return customerRepository.findCustomerByVatNumber(vatNo);
    }
    @Override
    public Boolean checkIfCustomerInDB(Customer customer){
        return customerRepository.findCustomerByVatNumber(customer.getVatNumber()).isPresent();
    }
}
