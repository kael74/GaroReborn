package ga.spring.hiber.model;
// Generated 06/07/2017 07:53:14 PM by Hibernate Tools 4.3.1



/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private int idrol;
     private String rol;
     private Usuario usuario;

    public Rol() {
    }

	
    public Rol(int idrol, String rol) {
        this.idrol = idrol;
        this.rol = rol;
    }
    public Rol(int idrol, String rol, Usuario usuario) {
       this.idrol = idrol;
       this.rol = rol;
       this.usuario = usuario;
    }
   
    public int getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


