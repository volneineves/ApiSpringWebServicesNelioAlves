package com.educandoweb.workshop.repositories;

import com.educandoweb.workshop.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
