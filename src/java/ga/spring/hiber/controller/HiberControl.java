/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.controller;

import ga.spring.hiber.dao.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Computer
 */
@Controller
public class HiberControl {
    
   private static UsuarioDAO use = new UsuarioDAO();
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
    
    @RequestMapping("/v")
    public String principal(HttpServletRequest request, HttpServletResponse response) {
        String url = "index";
        String user = request.getParameter("user");
        String clave = request.getParameter("pass");
        try {
            if (use.validar(user, clave) == 1) {
                request.setAttribute("user", user);
                url = "main";
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

        return url;
    }
}
