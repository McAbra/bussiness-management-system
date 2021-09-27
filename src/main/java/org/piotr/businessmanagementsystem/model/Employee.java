package org.piotr.businessmanagementsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String personName;
    private String personLastName;
    private String personEmail;
    private String personPhoneNo;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


}