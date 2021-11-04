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
public class Perro extends Animal {
    public Perro(String name, String breed, int age) {
        super(name, age);
    }

    @Override
    public void comer() {
        System.out.println(nombre + " estoy comiendo croquetas ");
    }

    public void ladrar() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Woof ! woof! Woof!");
        }
        System.out.println("Woof ! woof! Woof!");
    }
}
