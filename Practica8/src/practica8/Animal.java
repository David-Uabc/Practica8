/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author David-pc
 */
public class Animal {
	String NOMBRE;
	int EDAD;
	boolean vacuna;
	public Animal(String NOMBRE, int EDAD){
	this.NOMBRE = NOMBRE;
	this.EDAD = EDAD;
	}
	public void COMER(){
	System.out.println(NOMBRE +"  !!ESTOY COMIENDO!! ");
	}
	public void DORMIR(){
	System.out.println(NOMBRE + "  !!ESTOY DURMIENDO!! ");
	}
	public void setVacuna(boolean vacuna){
	this.vacuna = vacuna;
	}
}