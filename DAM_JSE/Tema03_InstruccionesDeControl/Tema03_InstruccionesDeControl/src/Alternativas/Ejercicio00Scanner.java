package Alternativas;

import java.util.Scanner;

public class Ejercicio00Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Dame un numero entero:");
		int numero = scanner.nextInt();
		System.out.println(numero);
		System.out.println("Dame un numero con decimales:");
		double real = scanner.nextDouble();
		System.out.println(real);
		System.out.println("Dame una palabra:");
		String nombre = scanner.next();
		System.out.println(nombre);
		
		scanner.close();
		
	}

}
