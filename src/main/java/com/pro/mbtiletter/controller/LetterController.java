package com.pro.mbtiletter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LetterController {

    @GetMapping("/hello")
    public String home(){
        return "hello";
    }
}
