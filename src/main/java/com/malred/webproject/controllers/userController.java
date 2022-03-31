package com.malred.webproject.controllers;

import com.malred.webproject.dao.*;
import com.malred.webproject.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private userDao userDao;
    @RequestMapping("/choice")
    public String choice(){
        return "choice";
    }
    @RequestMapping("/all")
    @ResponseBody
    public List<user> all(){
        return userDao.findAll();
    }
    @RequestMapping("/insert")
    public String insert(user u){
        userDao.saveUser(u);
        return "success";
    }
    @RequestMapping("/update")
    public String update(user u){
        userDao.updateUser(u);
        return "success";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        userDao.deleteById(id);
        return "success";
    }
    @PostMapping("/find")
    @ResponseBody
    public user find(Integer id){
        return userDao.findById(id);
    }
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String,Object> map){
        map.put("name","王");
        return "freemarkerIndex";
    }
}
