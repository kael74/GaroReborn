/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.controller;

import ga.spring.hiber.dao.ProductoDAO;
import ga.spring.hiber.dao.UsuarioDAO;
import ga.spring.hiber.model.Producto;
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
   private static ProductoDAO po = new ProductoDAO();
    //@RequestMapping("/index")
//    public String index(Model model){
//    //model.addAttribute("user", "jose Rayo");
//        return "index";
//    }
    @RequestMapping("/index")
    public String main(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "main";
    }
    @RequestMapping("/registrar")
    public String registrar(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "registrar_p";
    }
    @RequestMapping("/precios")
    public String pre(Model model){
    String url = "precios";
        try {
            model.addAttribute("lista",po.readAll());
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return url;
    }
    @RequestMapping("/listar")
    public String listar(Model model){
    //model.addAttribute("user", "jose Rayo");
        return "listar";
    }
    @RequestMapping("/u")
    public String u(Model model, HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
            model.addAttribute("lista", po.read(id));
                    return "update";
    }
    @RequestMapping("/upda")
    public String upda(Model model, Producto producto){
        String url="precios";
            if(po.update(producto)>0){
                url= pre(model);
            }
        return url;
    }
}
    
//    @RequestMapping("/v")
//    public String principal(HttpServletRequest request, HttpServletResponse response) {
//        String url = "index";
//        String user = request.getParameter("user");
//        String clave = request.getParameter("pass");
//        try {
//            if (use.validar(user, clave) == 1) {
//                request.setAttribute("user", user);
//                url = "main";
//            }
//        } catch (Exception e) {
//            System.out.println("Error:" + e);
//        }
//
//        return url;
//    }
//}
