package org.piotr.businessmanagementsystem.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter(value = AccessLevel.PACKAGE)
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
    @OneToMany (mappedBy = "employer")
    private List<Employee> customerEmployees = new ArrayList<>();


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
