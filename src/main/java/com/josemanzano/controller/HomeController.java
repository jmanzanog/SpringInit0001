package com.josemanzano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Created by DagoManzano on 12/1/2016.
 */
@Controller
@SessionAttributes("resultado")
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
    public String test(SessionStatus  sessionStatus){
        //limpiar datos de session
        //sessionStatus.setComplete();

        return "test";
    }
    @RequestMapping(value = "/")
    public String default_page(Model model){
        model.addAttribute("resultado", "resultado");
        model.addAttribute("mensaje", "mensaje desde el controlador  ");
        return "home";
    }
}
