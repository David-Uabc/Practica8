/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

/**
 *
 * @author David-pc
 */
import java.util.ArrayList;
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Parte 1 y 2");
        Animal animal = new Animal("solovinos",999);
        animal.comer();
        animal.dormir();
        System.out.println();
        
        Tiburon tiburon = new Tiburon("lasky","Gran Tiburon Blanco",7 );
         tiburon.comer();
         tiburon.dormir();
        System.out.println();
         
        Perro perro = new Perro("Husker","Labrador",18 );
        perro.comer();
        perro.dormir();

        
        Animal perrito = new Perro("Rosy", "Husky", 2);
        perrito.comer();
        perrito.dormir();
        perrito.ruido();
        System.out.println("\n");

        
        System.out.println("parte 3");
        Animal [] animals = new Animal[3];
        animals[0] = new Animal("An animal", 1);
        animals[1] = new Perro("Solovino","danese",12);
        animals[2] = new Tiburon("Megalodon", "Tiburon blanco", 88);
        System.out.println("\n");

        for (Animal a: animals) {
            a.comer();

            if(a instanceof Perro){
                ((Perro) a).ladrar();
            }
        }
        
        System.out.println("Parte del desafio de la practica");
        Zoo zoologico = new Zoo();
        zoologico.agregar();
        zoologico.agregar();
        zoologico.agregar();
        zoologico.eliminar();
        
        Veterinaria vete = new Veterinaria("para los perritos monos",1500 );
        vete.contarAnimales(zoologico.animales);
        zoologico.mostrar();

    }
        
        
        
        // TODO code application logic here
    }
    

