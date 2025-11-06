package Ejercicios_Actividad1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir una nota de 0 a 10 y mostrarla de la forma: 
		 * Insuficiente (<=4), 
		 * Suficiente (5),
		 * Bien (6), 
		 * Notable (7-8) y 
		 * Sobresaliente (9-10).
		 */
		//
		int nota = 0;
		
		System.out.println("Dame un número del 0 al 10");
		Scanner scanner = new Scanner(System.in);
		nota = scanner.nextInt();
		
		switch(nota) {
		case 0,1,2,3,4:
			System.out.println("Insuficiente");
		break;
		case 5:
		System.out.println("Suficiente");
		break;
		case 6:
		System.out.println("Bien");
		break;
		case 7,8:
		System.out.println("Notable");
		break;
		case 9,10:
		System.out.println("Sobresaliente");
		break;
		default:
			System.out.println("No es una nota válida");
		}
		
		if (nota <= 4) {
			System.out.println("Insuficiente");
		}else {
			if (nota == 5) {
					System.out.println("Suficiente");
		}else {
			if(nota == 6) {
				System.out.println("Bien");
			} else {
			if(nota == 7 || nota == 8) {
				System.out.println("Notable");
			}else {
				if(nota == 9 || nota == 10) {
					System.out.println("Sobresaliente");
			}else {
				if (nota < 0 || nota > 10) {
					System.out.println("No es una nota válida");
							}
						}
					}
				}		
			}
		
		}
		scanner.close();
	}
}
