package com.example.inter_of_vehicle.controller;

import com.example.inter_of_vehicle.model.User;
import com.example.inter_of_vehicle.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import javax.servlet.http.HttpServletRequest;

import java.sql.SQLException;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by 小年 on 2018/1/22.
 */
@RestController
@RequestMapping("/admin")
public class TestController {

    UserService userService;

    @RequestMapping(value="index/a/user",method =RequestMethod.GET)
    public ModelAndView page1() throws Exception{

        User user = userService.select(1);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("User",user);
        modelAndView.setViewName("/getUserById");

        return modelAndView;
    }

}