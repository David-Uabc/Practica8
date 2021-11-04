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
public class Tiburon extends Animal {
     
 public Tiburon( String NOMBRE, int EDAD) {
		
		super(NOMBRE, EDAD);
	}
	public void COMER() {
		System.out.println(NOMBRE + " ESTA COMIENDO MUCHOS PECES ");
	}
	public void nadar() {
		System.out.println(NOMBRE + " SE LA PASA NADANDO EN EL MAR ABIERTO");
	} 
}
