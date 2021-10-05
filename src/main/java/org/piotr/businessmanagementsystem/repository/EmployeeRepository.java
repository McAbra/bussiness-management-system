package org.piotr.businessmanagementsystem.repository;

import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Optional<Employee> findByPersonNameAndPersonLastName(String firstName, String lastName);

}
