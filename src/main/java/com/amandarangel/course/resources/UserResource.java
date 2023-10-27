package com.amandarangel.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amandarangel.entities.User;


@RestController
@RequestMapping(value= "/users")
public class UserResource {

    //endpoint para acessar os usuarios
    @GetMapping
    public ResponseEntity<User> findAll(){


        User u = new User(1L, "AMANDA", "AMANDA@GMAIL.COM", "12334", "1234");
        return ResponseEntity.ok().body(u);
    }
}
