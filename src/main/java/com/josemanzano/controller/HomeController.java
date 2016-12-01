package com.josemanzano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DagoManzano on 12/1/2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
}
