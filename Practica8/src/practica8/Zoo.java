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

class Zoo {
    //lo utilzo para almacernar los animales es mucho mas facil con este paquete 
    ArrayList<Animal> animales = new ArrayList<>();
    
    int Aux;

    public void agregar() {
        System.out.println("Que deseas agregar.");
        System.out.println("1)Perro");
        System.out.println("2)Tiburon");
        System.out.println("3)Pinguino");
       
        int opc;
        opc = CapturaEntrada.capturarEntero("opcion a elegir");
        switch (opc) {
            case 1:
                animales.add(new Dog(CapturaEntrada.capturarCadena("Nombre "), "Husky", /*edad*/5));
                break;
            case 2:
                animales.add(new Shark(CapturaEntrada.capturarCadena("Nombre "), "Gran Tiburon Blanco", /*edad*/7));
                break;
            case 3:
                animales.add(new Pinguin("Skypper !!bonitos y gorditos muchachos!!", /*edad*/12));
                
                break;
        }
        Aux++;
        System.out.println("Ingrese el numero del animal " + Aux);
    }

    
    //aqui el numero para eleminar sera predeterminado osea 1 2 0 3
    
    public void eliminar() {
        int Auxs;
        Auxs = CapturaEntrada.capturarEntero("Ingresa el Numero del animal que desea eleminar ");
        animales.remove(Auxs - 1);
        Aux--;
    }

    public void mostrar() {
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i).getNombre());
            System.out.println(animales.get(i).getEdad());
        }

    }

}
