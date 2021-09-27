package org.piotr.businessmanagementsystem.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String vatNumber;
    @OneToOne
    @JoinColumn(name = "addressId", referencedColumnName = "addressID")
    private Address address;
    @OneToMany(mappedBy = "customer")
    private List<Address> shippingAddresses = new ArrayList<>();
    @OneToMany (mappedBy = "customer")
    private List<Employee> customerEmployees = new ArrayList<>();

}
