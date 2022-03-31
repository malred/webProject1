package com.malred.webproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Controller
@RequestMapping("/ftl")
public class ftlController {
    @RequestMapping("/update")
    public String update(){
        return "update";
    }
    @RequestMapping("/insert")
    public String insert(){
        return "insert";
    }
    @RequestMapping("/delete")
    public String delete(){
        return "delete";
    }
    @RequestMapping("/find")
    public String find(){
        return "find";
    }
}
