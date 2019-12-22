package com.example.demo.crontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("info")
    public String info() {

        return "String Boot12345";
    }
}
