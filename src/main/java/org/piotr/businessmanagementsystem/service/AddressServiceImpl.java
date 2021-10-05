package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;
import org.piotr.businessmanagementsystem.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;

    public List<Address> findAllAddresses() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Address findAddress(AddressDto addressDto) {
        return null;
    }

    public boolean isAddressInDb(AddressDto addressDto) {
        return addressRepository.existsByCityAndStreetAndNumber(addressDto.getCity(),
                addressDto.getStreet(), addressDto.getNumber());
    }
}
