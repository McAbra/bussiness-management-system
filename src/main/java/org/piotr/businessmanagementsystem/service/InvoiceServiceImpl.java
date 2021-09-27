package org.piotr.businessmanagementsystem.service;

import org.piotr.businessmanagementsystem.model.Invoice;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Override
    public Invoice findInvoiceByNumber(String invoiceNo) {
        return null;
    }
}
