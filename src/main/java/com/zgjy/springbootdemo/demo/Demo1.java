package com.zgjy.springbootdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springbootdemo
 * @description: com.zgjy.springbootdemo.demo
 * @author: Mr.Cong
 * @create: 2020-05-11 22:09
 **/
@Controller
public class Demo1 {
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    @ResponseBody
       public  String  sayHello(){
           return  "hello boot";
       }
}
