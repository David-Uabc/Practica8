/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author David-pc
 */
public class Perro extends Animal {
	public Perro(String NOMBRE, int EDAD){
		super(NOMBRE, EDAD);
		}
		public void COMER(){
			System.out.println(" El perro " + NOMBRE + " esta comiendo sus croquetas ");
		}
		public void DORMIR(){
		System.out.println(NOMBRE + " Essta durmiendo zzzzzzZZZZzzzzz");
		}
		public void ladrar(){
		System.out.println(NOMBRE + " Esta ladrando !! WOOF WOOF !!");
		}
	}