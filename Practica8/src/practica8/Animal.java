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
class Animal {
    protected String nombre;
    protected int edad;
    private boolean vacuna;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " es toy comiendo mucho uhmmmmmm");
    }

    public void dormir() {
        System.out.println(nombre + " estoy durmiendo zzzZZZZzzz");
    }

    public void ruido() {
        System.out.println("Hago ruido yo " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean estoVacunado() {
        return vacuna;
    }

    public void setVacunado(boolean vacuna) {
        this.vacuna = vacuna;
    }
}