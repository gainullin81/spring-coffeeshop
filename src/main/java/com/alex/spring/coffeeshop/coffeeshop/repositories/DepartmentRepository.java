package com.alex.spring.coffeeshop.coffeeshop.repositories;

import com.alex.spring.coffeeshop.coffeeshop.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
