package org.piotr.businessmanagementsystem;

import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialDataSetup implements CommandLineRunner {

    @Autowired
    private CustomerServiceImpl customerService;


    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer();
        Customer customer1 = new Customer();
;
        customer.setName("FIxon");
        customer.setVatNumber("7589632144");

        customer1.setName("ZOLOFT");
        customer1.setVatNumber("895-25-96");
        customerService.addCustomer(customer1);
        customerService.addCustomer(customer);
    }
}
