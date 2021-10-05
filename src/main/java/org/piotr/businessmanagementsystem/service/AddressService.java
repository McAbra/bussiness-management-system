package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;

public interface AddressService {

    Address findAddress(AddressDto addressDto);

    boolean isAddressInDb(AddressDto addressDto);
}
