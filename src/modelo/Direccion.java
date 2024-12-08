/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Direccion {
    //Atributos
    private String calle;
    private String ciudad;
    private int codPostal;
    private String pais;
    //Constructores

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, int codPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.pais = pais;
    }
    //Encapsulamiento

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    //Reglas de Negocio

    @Override
    public String toString() {
        return "\n    * Pais: " + getPais()+"\n"+
               "    * Código Postal:  "+getCodPostal()+"\n"+
               "    * Ciudad:  "+ getCiudad()+"\n"+
               "    * Calle: "+ getCalle();
    }
    
    
}
