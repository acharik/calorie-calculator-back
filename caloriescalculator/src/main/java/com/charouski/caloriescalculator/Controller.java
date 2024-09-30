package com.charouski.caloriescalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("sasi")
    public String getSasi(){
        return "sasi Vlad";
    }
}
