package org.piotr.businessmanagementsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String city;
    private String street;
    private String number;
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


}
