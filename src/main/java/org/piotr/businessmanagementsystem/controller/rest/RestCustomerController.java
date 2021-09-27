package org.piotr.businessmanagementsystem.controller.rest;

import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.service.CustomerService;
import org.piotr.businessmanagementsystem.service.CustomerServiceImpl;
import org.piotr.businessmanagementsystem.service.InvoiceService;
import org.piotr.businessmanagementsystem.service.InvoiceServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.rmi.NoSuchObjectException;
import java.util.List;

@RestController
public class RestCustomerController {

    private final CustomerService customerService;
    private final InvoiceService invoiceService;

    public RestCustomerController (CustomerService customerService, InvoiceService invoiceService) {
        this.customerService = customerService;
        this.invoiceService = invoiceService;
    }

    @GetMapping("/rest/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/rest/customer")
    @ResponseBody
    public Customer getCustomerByName(@RequestParam String name) throws NoSuchObjectException {
        return customerService.getCustomerByName(name);
    }

    @PostMapping("/rest/customer/add")
    public void addCustomer(@RequestBody Customer customer) {
        if (!customerService.checkIfCustomerInDB(customer)) {
            System.out.println(customer);
            customerService.addCustomer(customer);
        }
    }
}
