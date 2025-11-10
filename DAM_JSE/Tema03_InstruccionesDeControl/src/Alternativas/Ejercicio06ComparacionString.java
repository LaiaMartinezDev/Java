package Alternativas;

import java.util.Scanner;

public class Ejercicio06ComparacionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre1 = "andres";
		String nombre2 = "andres";
		String nombre3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("escribe tu nombre");
		nombre3 = scanner.next();
		
		if(nombre1 == nombre2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		System.out.println("COMPARCION NETRE NOMBRE1 y NOMBRE3");
		
		if(nombre1 == nombre3) {
			System.out.println("Son iguales tras scanner");
		} else {
			System.out.println("Son distintos tras scanner");
		}
		/*
		 * we use equals to compare string variables by their "contenido"
		 * equalsIgnoreCase does not case about the upper and down cases 
		 */
		if(nombre1.equals(nombre3)) {
			System.out.println("IGUALES POR CONTENIDO");
		}else {
			System.out.println("DISTIONTO POR CONTENIDO");
		}
	}

}
