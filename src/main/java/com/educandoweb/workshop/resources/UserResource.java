package com.educandoweb.workshop.resources;

import com.educandoweb.workshop.entities.User;
import com.educandoweb.workshop.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = services.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

//    {
//        id: 1,
//        name: "Maria",
//        email: "maria@gmail.com",
//        phone: "99999999",
//        password: "123456"
//    }
