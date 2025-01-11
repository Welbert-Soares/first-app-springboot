package com.w3soft.firstappspringboot.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyComponent {
    public String callMyComponent(){
        return "Chamando o meu componente";
    }
}
