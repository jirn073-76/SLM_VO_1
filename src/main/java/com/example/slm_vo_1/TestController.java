package com.example.slm_vo_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String greetUser() {
        return "Hello, world!";
    }

}
