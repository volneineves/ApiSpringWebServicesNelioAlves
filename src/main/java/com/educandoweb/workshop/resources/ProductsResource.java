package com.educandoweb.workshop.resources;

import com.educandoweb.workshop.entities.Products;
import com.educandoweb.workshop.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductsResource {

    @Autowired
    private ProductsServices services;

    @GetMapping
    public ResponseEntity<List<Products>> findAll(){
        List<Products> list = services.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Products> findById(@PathVariable Long id){
        Products obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}