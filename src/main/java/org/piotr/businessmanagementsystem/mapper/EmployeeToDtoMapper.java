package org.piotr.businessmanagementsystem.mapper;

import org.dom4j.rule.Mode;
import org.modelmapper.ModelMapper;
import org.piotr.businessmanagementsystem.dto.EmployeeDto;
import org.piotr.businessmanagementsystem.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeToDtoMapper {

    private final ModelMapper modelMapper;

    public EmployeeToDtoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public EmployeeDto mapToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }

}
