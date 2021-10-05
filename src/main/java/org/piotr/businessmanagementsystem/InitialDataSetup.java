package org.piotr.businessmanagementsystem;

import org.modelmapper.ModelMapper;
import org.piotr.businessmanagementsystem.dto.EmployeeDto;
import org.piotr.businessmanagementsystem.mapper.EmployeeToDtoMapper;
import org.piotr.businessmanagementsystem.model.Customer;
import org.piotr.businessmanagementsystem.model.Employee;
import org.piotr.businessmanagementsystem.service.CustomerService;
import org.piotr.businessmanagementsystem.service.CustomerServiceImpl;
import org.piotr.businessmanagementsystem.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InitialDataSetup implements CommandLineRunner {


    private CustomerService customerService;

    private EmployeeService employeeService;

    public InitialDataSetup(CustomerService customerService, EmployeeService employeeService) {
        this.customerService = customerService;
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer = Customer.builder().name("ZOLOFT").vatNumber("8563249644").customerEmployees(new ArrayList<>()).build();
        Customer customer1 = Customer.builder().name("FLIPEX").vatNumber("2034569871").build();
        Customer customer2 = Customer.builder().name("GUMOTECHNIX").vatNumber("4586321214").build();


        customerService.addCustomer(customer1);
        customerService.addCustomer(customer);
        customerService.addCustomer(customer2);
        //customerService.addEmployee(customer, employee);

        Employee employee = Employee.builder()
                .employer(customer)
                .personName("Jan")
                .personLastName("Woda")
                .personEmail("j.woda@zoloft.pl")
                .personPhoneNo("254 365 214")
                .build();
        employeeService.addEmployee(employee);

        System.out.println(employee);

        System.out.println("Jan Woda saved to db");

        Employee employee1 = Employee.builder()
                .employer(customer)
                .personName("Jan")
                .personLastName("Woda")
                .personEmail("jan.w@zoloft.pl")
                .build();

        Employee employeeToUpdate = employeeService.findEmployee(employee);
        employeeToUpdate.setPersonName("Krzysztof");
        employeeService.addEmployee(employeeToUpdate);
        EmployeeToDtoMapper employeeToDtoMapper = new EmployeeToDtoMapper(new ModelMapper());
        EmployeeDto employeeDto1 = employeeToDtoMapper.mapToDto(employee);
        System.out.println(employeeDto1);

    }
}
