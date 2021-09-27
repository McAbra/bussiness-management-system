package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.model.Invoice;

public interface InvoiceService {

    Invoice findInvoiceByNumber(String invoiceNo);

}
