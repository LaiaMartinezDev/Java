package Repetitivas;

import java.util.Scanner;

public class Ejercicio07BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vamos a leer de la consola numero senteros hasta que pulsen un numero negativo
		 * Al final queremos saber:
		 * - Cuantos numeros he obtenido
		 * - sumano esos numoer
		 * -cuantos son pares
		 */
		int cuantosLeidos = 0, suma =0, cuantosPares = 0;
		int numeroLeido = 0;
		Scanner scanner = new Scanner (System.in);
		
		// 1. - Leer el primer numero de la consola
		System.out.println("Dame un numero entero , negativo para salir , ej: -2");
		numeroLeido = scanner.nextInt();
		
		// 2. - Plantear el bucle
		while (numeroLeido >= 0) {
			// 3. - Tratamiento de cada numero
			cuantosLeidos++;
			suma += numeroLeido;
			
			if(numeroLeido % 2 == 0 ) {
				cuantosPares++;
			}
			
			// 4. - Volver a leer
			System.out.println("Dame un numero entero , negativo para salir , ej: -2");
			numeroLeido = scanner.nextInt();
			
		}

		
		// 5. - Mostrar estadisticas
		
		System.out.println("ESTADISTICAS");
		System.out.println("Numeros leidos: " + cuantosLeidos);
		System.out.println("Suma total: " + suma);
		System.out.println("ESTADISTICAS");
	}

}
