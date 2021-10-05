package org.piotr.businessmanagementsystem.controller.rest;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;
import org.piotr.businessmanagementsystem.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

//    private AddressServiceImpl addressService;
//
//    public AddressController(AddressServiceImpl addressService) {
//        this.addressService = addressService;
//    }
//
//    @GetMapping("/addresses")
//    public List<AddressDto> getAllAddresses() {
//        return addressService.getAllAddresses();
//    }
//
//    @PostMapping("/address/add")
//    public void addAddress(@RequestBody AddressDto addressDto){
//
//    }

}
