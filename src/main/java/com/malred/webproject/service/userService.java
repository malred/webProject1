package com.malred.webproject.service;

import com.malred.webproject.dao.userDao;
import com.malred.webproject.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Service
public class userService {
    @Autowired
    private userDao userDao;
    public List<user> findAll(){
        return userDao.findAll();
    }

    public void saveUser(user u) {
        userDao.saveUser(u);
    }

    public void updateUser(user u) {
        userDao.updateUser(u);
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

    public user findById(Integer id) {
        return userDao.findById(id);
    }
}
