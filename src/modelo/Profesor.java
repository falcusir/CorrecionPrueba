/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Profesor extends Persona{
    //Atributos
    private String despacho;
    //Constructores

    public Profesor() {
    }

    public Profesor(String despacho) {
        this.despacho = despacho;
    }

    public Profesor(String despacho, String nombre, String apellido, int cedula, Direccion direccion) {
        super(nombre, apellido, cedula, direccion);
        this.despacho = despacho;
    }
    //Encapsulamiento

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    //Regas de Negocio

    @Override
    public String toString() {
        return "DATOS DEL PROFESOR\n"+
                "\nCédula: "+getCedula()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellidos: "+getApellido()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Despacho: "+ getDespacho();
    }
    
    @Override
        public void identificacion(){
            System.out.println("El nombre de la clase es PERSONA");
   }
    
    
    
}
