package ga.spring.hiber.model;
// Generated 06/07/2017 07:53:14 PM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idproducto;
     private String nombre;
     private String marca;
     private int precio;
     private Venta venta;

    public Producto() {
    }

	
    public Producto(int idproducto, String nombre, int precio) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(int idproducto, String nombre, String marca, int precio, Venta venta) {
       this.idproducto = idproducto;
       this.nombre = nombre;
       this.marca = marca;
       this.precio = precio;
       this.venta = venta;
    }
   
    public int getIdproducto() {
        return this.idproducto;
    }
    
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Venta getVenta() {
        return this.venta;
    }
    
    public void setVenta(Venta venta) {
        this.venta = venta;
    }




}


