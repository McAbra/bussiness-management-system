package org.piotr.businessmanagementsystem.controller.rest;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;
import org.piotr.businessmanagementsystem.service.AddressServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    private AddressServiceImpl addressService;

    @GetMapping("/adresses")
    public List<Address> getAllAddresses() {
        return addressService.findAllAddresses();
    }

    @PostMapping("/address/add")
    public void addAddress(@RequestBody AddressDto addressDto){

    }

}
