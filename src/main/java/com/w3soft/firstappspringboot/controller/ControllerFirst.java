package com.w3soft.firstappspringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/controllerFirst")
public class ControllerFirst {
    @GetMapping("/methodFirst/{id}")
    public String methodFirst(@PathVariable String id) {
        return "O parametro é " + id;
    }

    @GetMapping("/methodWithQueryParams")
    public String methodWithQueryParams(@RequestParam String id){
        return "O parametro metodo com query params é " + id;
    }

    @GetMapping("/methodWithQueryParams2")
    public String methodWithQueryParams2(@RequestParam Map<String, String> allParams){
        return "O parametro metodo com query params é " + allParams.entrySet();
    }

    @PostMapping("/methodWithBodyParams")
    public String methodWithBoryParams(@RequestBody User user){
        return "Você inseriu o username: " + user.username() + " na rota methodWithBodyParams";
    }

    @PostMapping("/methodWithHeaderParams")
    public String methodWithHeaderParams(@RequestHeader("name") String name){
        return "Você inseriu o username: " + name ;
    }

    @PostMapping("/methodWithListHeaderParams")
    public String methodWithListHeaderParams(@RequestHeader Map<String, String> headers){
        return "Você inseriu o username: " + headers.entrySet();
    }

    @GetMapping("/methodResponseEntity/{id}")
    public ResponseEntity<Object> methodResponseEntity(@PathVariable Long id){
        var user = new User("Welbert Soares");
        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }

        return ResponseEntity.badRequest().body("id menor que 5");
    }

    record User(String username){}

}