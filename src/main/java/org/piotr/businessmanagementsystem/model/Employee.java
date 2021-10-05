package org.piotr.businessmanagementsystem.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "employees")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter(value = AccessLevel.PUBLIC)
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
    private Customer employer;


}