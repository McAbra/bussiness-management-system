package org.piotr.businessmanagementsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "invoices")
@NoArgsConstructor
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    private String invoiceNo;

    @OneToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Customer customer;

    private LocalDate issueDate;

    private Long paymentTerms;

    private LocalDate dueDate;

    private LocalDate paymentDate;

    @OneToMany
    @JoinTable(name = "invoice_product")
    private List<Product> products = new ArrayList<>();

    private BigDecimal total = products.stream()
            .map(Product::getListPrice)
            .reduce(BigDecimal::add)
            .orElse(BigDecimal.ZERO);


}
