/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public abstract class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int cedula;
    private Direccion direccion;
    
    //Constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido, int cedula, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    //Encapsulamiento

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    //Reglas de Negocio

    @Override
    public String toString() {
        return "DATOS DE LA PERSONA\n"+
                "Cédula: "+getCedula()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellidos: "+getApellido()+"\n"+
                "Dirección: "+getDireccion();
    }
    
     public abstract void identificacion();
    
    
}
