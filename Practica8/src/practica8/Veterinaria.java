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

public class Veterinaria {
    String name;
    double salary;

    public Veterinaria(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate(Animal animal) {
        animal.setVacunado(true);
        System.out.println(animal.getNombre() + " esta vacunado el esta Sano yahuuuuu");
    }

    public void contarAnimales(ArrayList<Animal> animals) {
        System.out.println(animals.size() + " Animales en el zoo");
    }
}