package com.josemanzano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DagoManzano on 12/1/2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
    @RequestMapping(value = "/")
    public String default_page(){
        return "home";
    }
}
