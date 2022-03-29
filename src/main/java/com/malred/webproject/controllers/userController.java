package com.malred.webproject.controllers;

import com.malred.webproject.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malguy-wang sir
 * @create ---
 */
@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @PostMapping("/add")
    public void add(user user){

    }
}
