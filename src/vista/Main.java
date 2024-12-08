/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Direccion;
import modelo.Persona;
import modelo.Profesor;

/**
 *
 * @author Dell Core i7
 */
public class Main {
    public static void main(String[] args) {
        
        Direccion d1 = new Direccion("Tungurahua", "Ibarra", 593, "Ecuador");       
        Profesor p1 = new Profesor("Desarrollo de Software", "Fernanda", "Alcusir", 1003188198, d1);
        System.out.println(p1.toString());

        
        }
    }
    
    

