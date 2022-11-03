package com.pro.mbtiletter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LetterController {

    @GetMapping("/hello")
    public String home(){
        return "hello";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/write")
    public String writeView(){
        return "write";
    }

//    @PostMapping("/write")
//    public String write(){
//        return "hello";
//    }
}
