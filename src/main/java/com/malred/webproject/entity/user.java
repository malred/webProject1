package com.malred.webproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author malguy-wang sir
 * @create ---
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    private Integer id;
    private String username;
    private Date birthday;
    private char sex;
    private String address;
}
