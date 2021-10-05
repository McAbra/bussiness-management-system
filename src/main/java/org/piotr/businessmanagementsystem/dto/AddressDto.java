package org.piotr.businessmanagementsystem.dto;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private String city;
    private String street;
    private String number;
    private String zipCode;
}
