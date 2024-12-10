package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${YUNHOS_PAY_TYPES:默认值}")
    private String YUNHOS_PAY_TYPES;

    @GetMapping("/test")
    public String test(){
        return "YUNHOS_PAY_TYPES的值为:" + YUNHOS_PAY_TYPES;
    }
}