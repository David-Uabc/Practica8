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
public class Pinguino extends Animal{
    
    
    	public Pinguino (String NOMBRE, int EDAD){
		super(NOMBRE, EDAD);
		}
	public void COMER(){
		System.out.println(EDAD + "  Estoy comiendo Pescado ");
		}
	public void volar(){
		System.out.println(NOMBRE + " No puede Volar solo Nadar ");
		} 
    }
    

