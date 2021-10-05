package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee findEmployee(Employee employee);

}
