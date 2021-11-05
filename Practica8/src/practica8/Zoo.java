package practica8;

import java.util.ArrayList;
public class Zoo {
	private ArrayList<Animal> anls = new ArrayList<>();
	private Veterinaria v = new Veterinaria(CapturaEntrada.capturarCadena("Introduce nombre del Veterinario"),CapturaEntrada.capturarDoble("Introduce Salario"));
	public void agregar(String animal){
		animal = animal.trim().toLowerCase();
		Animal a = null;
		switch(animal){
		case "perro" -> {
			a = new Perro(CapturaEntrada.capturarCadena("Introduce Nombre"),CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "tiburon" -> {
			a = new Tiburon(CapturaEntrada.capturarCadena("Introduce Nombre"), CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "gato" -> {
			a = new Gato(CapturaEntrada.capturarCadena("Introduce Nombre"),CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		
		default -> {
			System.out.println("Error, volver a intentar");
			}
		}
		if(a != null){
			anls.add(a);
		}
}
	public void imprimir(){
		for(Animal a: anls){
			a.COMER(); v.vacunar(a); v.revisar(a);a.DORMIR();
			if(a instanceof Perro){
				((Perro)a).ladrar();
				}
			else if(a instanceof Tiburon) {
				((Tiburon)a).nadar();
			}
			else if(a instanceof Gato){
				((Gato)a).RUNRUNAR();
				}
			System.out.println();
			}
	}
	public void quitar(){
		int i = 1, op;
		for(Animal a: anls){
			System.out.println("Numero de animal: " + i); System.out.print(a.NOMBRE + "\n"); i++;
			}
		op = CapturaEntrada.capturarEntero("Introduce el numero"); anls.remove((op-1));
		System.out.println("!! ANIMAL BORRADO EXITOSAMENTE !!");
		}
	}