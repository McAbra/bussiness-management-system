package org.piotr.businessmanagementsystem.repository;

import org.piotr.businessmanagementsystem.dto.AddressDto;
import org.piotr.businessmanagementsystem.model.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    public Address findAddress(Address address);

    public List<Address> getAllAddresses();

    public boolean existsByCityAndStreetAndNumber(String city, String street, String number);


}
