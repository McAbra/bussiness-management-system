package org.piotr.businessmanagementsystem.repository;

import org.piotr.businessmanagementsystem.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
