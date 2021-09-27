package org.piotr.businessmanagementsystem.repository;

import org.piotr.businessmanagementsystem.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findCustomerByName(String name);
    Optional<Customer> findCustomerByVatNumber(String vatNo);
}
