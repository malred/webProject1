package com.malred.webproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malguy-wang sir
 * @create ---
 */
@RestController
public class test {
    @RequestMapping("/t")
    public String t(){
        return "hello";
    }
}
