package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;

import java.util.List;

public interface AddressService {

    List<AddressDto> getAddressesByCity(String city);

    List<AddressDto> getAddressesByStreet(String street);

    List<AddressDto> getAddressesByZip(String zip);

    List<AddressDto> getAllAddresses();

    void addAddress(AddressDto addressDto);

    void removeAddress(AddressDto addressDto);



}
