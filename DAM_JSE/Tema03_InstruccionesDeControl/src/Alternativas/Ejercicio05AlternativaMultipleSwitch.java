package Alternativas;

import java.util.Scanner;

public class Ejercicio05AlternativaMultipleSwitch {
	/* Una variabla tiene una serie de valores discretos
	 * y cada valor o conjunto de valores tiene distinto tratamiento
	 * variables enteras, char y String
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diaSemana = 1;
		Scanner scanner = new Scanner(System.in);
		diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
		case 2:
			System.out.println("Martes");
		case 3:
			System.out.println("Miercoles");
		case 4:
			System.out.println("Jueves");
		case 5:
			System.out.println("Viernes");
		case 6,7:
			System.out.println("Fin de Semana");
		default: 
			System.out.println("Dia incorrecto");
		}
		scanner.close();
	}

}
