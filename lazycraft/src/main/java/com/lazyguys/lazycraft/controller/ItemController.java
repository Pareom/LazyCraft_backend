package com.lazyguys.lazycraft.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/item/{id}")
    public ResponseEntity<String> getItemById(Long id){
        System.out.println("route get item by id");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
