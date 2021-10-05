package org.piotr.businessmanagementsystem.dto;

import lombok.*;
import org.piotr.businessmanagementsystem.model.Customer;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Long id;
    private String personName;
    private String personLastName;
    private String personEmail;
    private String personPhoneNo;
    private Customer employer;
}
