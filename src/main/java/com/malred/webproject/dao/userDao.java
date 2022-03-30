package com.malred.webproject.dao;

import com.malred.webproject.entity.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author malguy-wang sir
 * @create ---
 */
public interface userDao {
    @Select("select * from user")
    public List<user> findAll();
    @Insert("insert into user (username,birthday,sex,address)" +
            " values" +
            "(#{username},#{birthday},#{sex},#{address})")
    public void saveUser(user u);
    @Update("update user set username=#{username}," +
            "birthday=#{birthday}," +
            "sex=#{sex}," +
            "address=#{address} " +
            "where id=#{id}")
    public void updateUser(user u);
    @Delete("delete from user where id=#{id}")
    public void deleteById(Integer id);
}
