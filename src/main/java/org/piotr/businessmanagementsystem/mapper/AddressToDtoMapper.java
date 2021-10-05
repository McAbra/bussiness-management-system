package org.piotr.businessmanagementsystem.mapper;

import org.modelmapper.ModelMapper;
import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressToDtoMapper {

    private final ModelMapper modelMapper;

    public AddressToDtoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public AddressDto addressToDtoMapper(Address address){
        return modelMapper.map(address, AddressDto.class);
    }
}
