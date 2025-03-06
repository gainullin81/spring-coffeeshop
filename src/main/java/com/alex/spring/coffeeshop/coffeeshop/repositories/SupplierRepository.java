package com.alex.spring.coffeeshop.coffeeshop.repositories;

import com.alex.spring.coffeeshop.coffeeshop.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
