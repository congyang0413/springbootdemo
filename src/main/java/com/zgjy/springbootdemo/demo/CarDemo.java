package com.zgjy.springbootdemo.demo;

import com.zgjy.springbootdemo.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: springbootdemo
 * @description: CarDemo
 * @author: Mr.Cong
 * @create: 2020-05-11 22:21
 **/
@RestController
@RequestMapping("/car")

public class CarDemo {
    @RequestMapping("/findone")
    public Car findOneCar(){
        Car car = new Car(1, "toyo", 1999.99F,new Date());


        return car;
    }

}
