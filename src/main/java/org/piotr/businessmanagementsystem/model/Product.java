package org.piotr.businessmanagementsystem.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    private String productName;
    private String productCatNo;
    private Integer quantity;
    private BigDecimal listPrice;
}
