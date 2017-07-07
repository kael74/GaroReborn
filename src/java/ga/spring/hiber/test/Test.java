/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.spring.hiber.test;


import ga.spring.hiber.dao.DetalleDAO;
import ga.spring.hiber.dao.PersonaDAO;
import ga.spring.hiber.dao.ProductoDAO;
import ga.spring.hiber.dao.UsuarioDAO;
import ga.spring.hiber.dao.VentaDAO;
import ga.spring.hiber.model.Producto;
import ga.spring.hiber.model.Rol;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Computer
 */
public class Test {
    private static DetalleDAO det = new DetalleDAO();
    private static PersonaDAO per = new PersonaDAO();
   private static ProductoDAO prod = new ProductoDAO();
   private static UsuarioDAO use = new UsuarioDAO();
   private static VentaDAO ven = new VentaDAO();
   
    
     /* @param args the command line arguments*/
     
    public static void main(String[] args) {
         /*TODO code application logic here*/
        crear();
        //eliminar();
        //editar();
        //listar();
        
    }
    public static void conex(EntityManager f){
        System.out.println("F: "+f.isOpen());
       
    }
    public static void crear(){
        Producto pro = new Producto();
        
        pro.setNombre("Laptop");        
        pro.setMarca("Asus");
        pro.setPrecio(200);
        if(prod.create(pro)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void editar(){
        Producto p = new Producto();
        int x = 2;
        p.setIdproducto(x);
        p.setNombre("Colt");
        p.setPrecio(340); 
        if(prod.update(p)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void eliminar(){
        int x = 0;        
        if(prod.delete(x)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void listar(){
        List<Producto> lista = prod.readAll();
        for(Producto produ:lista){
            System.out.println(produ.getNombre()+"\t"+produ.getPrecio()+"\t"+produ.getMarca());
        }
    }
    
}
