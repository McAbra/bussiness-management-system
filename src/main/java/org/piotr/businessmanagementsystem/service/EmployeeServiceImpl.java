package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.model.Employee;
import org.piotr.businessmanagementsystem.repository.CustomerRepository;
import org.piotr.businessmanagementsystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, CustomerRepository customerRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        if (isEmployeeInDb(employee)){
         employeeRepository.delete(employee);
        } else{
            System.out.println("Employee not found");
        }

    }

    @Override
    public void updateEmployee(Employee employee) {
        if (isEmployeeInDb(employee)) {
            Employee employeeInDb = employeeRepository.findByPersonNameAndPersonLastName(employee.getPersonName(), employee.getPersonLastName()).get();

            employeeRepository.save(employee);
        } else {
            System.out.println("Employee not found");
        }
    }

    @Override
    public Employee findEmployee(Employee employee) {
        if (isEmployeeInDb(employee)){
            return employeeRepository.findByPersonNameAndPersonLastName(employee.getPersonName(), employee.getPersonLastName()).get();
        } else{
            System.out.println("Employee not found");
        }
        return employee;
    }

    boolean isEmployeeInDb(Employee employee) {
        return employeeRepository.findByPersonNameAndPersonLastName(employee.getPersonName(),
                employee.getPersonLastName()).isPresent();
    }

}
