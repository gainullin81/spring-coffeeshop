package com.alex.spring.coffeeshop.coffeeshop.services;

import com.alex.spring.coffeeshop.coffeeshop.models.Supplier;
import com.alex.spring.coffeeshop.coffeeshop.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> findAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier findSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    public void saveSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
