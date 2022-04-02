package com.malred.webproject.controllers;

import com.malred.webproject.dao.userDao;
import com.malred.webproject.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
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
    private com.malred.webproject.service.userService userService;
    @RequestMapping("/choice")
    public String choice(){
        return "choice";
    }
    @RequestMapping("/all")
    public String all(Map map){
        List<user> all = userService.findAll();
        map.put("list",all);
        return "findAll";
    }
    @RequestMapping("/insert")
    public String insert(user u){
        userService.saveUser(u);
        return "choice";
    }
    @RequestMapping("/update")
    public String update(user u){
        userService.updateUser(u);
        return "success";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        userService.deleteById(id);
        return "success";
    }
    @PostMapping("/find")
    public String find(Integer id,Map<String, Object> map){
        List<user> list = new ArrayList<>();
        user byId = userService.findById(id);
        list.add(byId);
        map.put("list",list);
        return "userFindId";
    }
}
