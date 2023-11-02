/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Date;

public class DTActividad {
    private String nombre;
    private String descripcion;
    private int duracion;
    private float costo;
    private String ciudad;
    private Date fAlta;
    private TipoEstado estado;
    private ArrayList<String> listaNombresSalidaTuristica; 
    private ArrayList<String> listaNombresPaquete; 
    private String nombreDepartamento;
    private String nombreProveedor;
    private ArrayList<String> listaNombresCategoria; 
    
     public DTActividad(String nombre, String descripcion, int duracion, float costo, String ciudad, Date fAlta,TipoEstado estado, String nombreDepartamento, String nombreProveedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.ciudad = ciudad;
        this.fAlta = fAlta;
        this.estado = estado;
        this.nombreDepartamento = nombreDepartamento;
        this.nombreProveedor = nombreProveedor;
    }
     
  

    public DTActividad() {
        
    }

    public String getNombre() {
        return nombre;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    

    public int getDuracion() {
        return duracion;
    }

    

    public float getCosto() {
        return costo;
    }

    

    public String getCiudad() {
        return ciudad;
    }

    

    public Date getfAlta() {
        return fAlta;
    }
    
    public TipoEstado getEstado() {
        return estado;
    }

    

    public ArrayList<String> getNombresSalidaTuristica() {
        return listaNombresSalidaTuristica;
    }

   

    public ArrayList<String> getNombresPaquete() {
        return listaNombresPaquete;
    }

    

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    
    public String getNombreProveedor() {
        return nombreProveedor;
    }

  
    public ArrayList<String> getNombresCategoria() {
        return listaNombresCategoria;
    }

    
}

