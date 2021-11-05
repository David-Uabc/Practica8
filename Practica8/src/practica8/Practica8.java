/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

/**
 *
 * @author David-pc
 */
public class Practica8 {
    
	public static void main(String[] args) {
	
	int opc;
	Zoo zoo = new Zoo();
	
	do {
		System.out.println();
		System.out.println("--- MENU OPCIONES --- ");
		System.out.println("*1. Mostrar animal");
		System.out.println("*2. Capturar animal");
		System.out.println("*3. Eliminar animal");
		System.out.println("*4. Salir");
		opc = CapturaEntrada.capturarEntero("Opcion");
		switch(opc) {
		case 1:	{
			zoo.imprimir();
			break;
			}
		case 2:{
                    System.out.println("COLOCA EL ANIMAL AGREGAR");
                    System.out.println("(perro)---(tiburon)---(gato)");
                    System.out.println("Solo puede ser esas opciones");
			zoo.agregar(CapturaEntrada.capturarCadena("Agregar"));
			break;
			}
		case 3:{
			zoo.quitar();
			break;
			}
		}
		
		} while(opc!=4);
		System.out.println("  PROGRAMA TERMINADO ");
	}
	
}