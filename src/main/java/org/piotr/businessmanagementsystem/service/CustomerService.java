package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.model.Customer;

import java.rmi.NoSuchObjectException;
import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getCustomerByName(String name) throws NoSuchObjectException;

    Optional<Customer> getCustomerByVATNumber(String vatNo);

    void addCustomer(Customer customer);

    Boolean checkIfCustomerInDB(Customer customer);


}
