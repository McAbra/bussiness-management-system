package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.mapper.AddressMapper;
import org.piotr.businessmanagementsystem.model.Address;
import org.piotr.businessmanagementsystem.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;
    private AddressMapper addressMapper;

    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }


    @Override
    public List<AddressDto> getAddressesByCity(String city) {
        return null;
    }

    @Override
    public List<AddressDto> getAddressesByStreet(String street) {
        return null;
    }

    @Override
    public List<AddressDto> getAddressesByZip(String zip) {
        return null;
    }

    @Override
    public List<AddressDto> getAllAddresses() {
        return addressRepository.findAll().stream()
                .map(address -> addressMapper.addressToDtoMapper(address))
                .collect(Collectors.toList());
    }

    @Override
    public void addAddress(AddressDto addressDto) {

    }

    @Override
    public void removeAddress(AddressDto addressDto) {

    }
}
