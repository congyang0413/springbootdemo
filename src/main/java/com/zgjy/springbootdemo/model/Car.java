package com.zgjy.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: springbootdemo
 * @description: demo
 * @author: Mr.Cong
 * @create: 2020-05-11 22:17
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private  Integer id;
    private  String name;
    private  Float price;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date date;
}
