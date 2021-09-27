package org.piotr.businessmanagementsystem.controller.mvc;

import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public String homepage() {
        return "HELLO";
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(ModelAndView mnv) {
        return customerService.getAllCustomers();

    }
}
