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
class Pinguin extends Animal{
    
    
     public Pinguin(String nombre, int edad) {
        super(nombre, edad);
    }

    public void movimiento() {
        System.out.println("Los pinguinos " + nombre + "se mueven con las patas separadas");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come muy rapido");
    }
    
}
