package org.piotr.businessmanagementsystem.repository;

import org.piotr.businessmanagementsystem.model.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
