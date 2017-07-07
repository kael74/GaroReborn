/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Computer
 */
@Controller
public class HiberControl {
    @RequestMapping("/index")
    public String index(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "index";
    }
    @RequestMapping("/main")
    public String main(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "main";
    }
    @RequestMapping("/registrar")
    public String registrar(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "registrar_p";
    }
    @RequestMapping("/listar")
    public String listar(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "listar";
    }
}
