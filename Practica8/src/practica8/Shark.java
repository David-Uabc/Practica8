/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author David-pc
 */
import java.util.ArrayList;
class Shark extends Animal {
     
       public Shark(String nombre, String raza, int edad) {
        super(nombre, edad);
    }

     @Override
    public void comer() {
        System.out.println(nombre + " Estoy comiendo muchos peces grrrrrr");
    }   
}
