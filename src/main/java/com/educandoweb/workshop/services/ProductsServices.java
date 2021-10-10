package com.educandoweb.workshop.services;

import com.educandoweb.workshop.entities.Products;
import com.educandoweb.workshop.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServices {

    @Autowired
    private ProductsRepository repository;

    public List<Products> findAll(){
        return repository.findAll();
    }

    public Products findById(Long id){
        Optional<Products> obj = repository.findById(id);
        return obj.get();
    }
}
