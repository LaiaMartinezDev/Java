package Ejecutables;

public class Ejercicio03OperadoresAritmeticos {
	/*
	 *  + suma
	 *  - resta
	 *  * multiplica
	 *  / divide
	 *  % resto de una division entera, divisor no tiene decimales
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Adios");
		System.out.println(3+4);
		System.out.println(3.2+6.5);
		System.out.println(6/2);
		System.out.println(21/5);// The division between 2 enters (enteros) it gives u an enter and it doesn't care about the decimals
		System.out.println((double)21/5); // If you want the decimals you have to put cast it as double
		System.out.println(21.0/5);
		
		System.out.println(21 % 5);
		
		System.out.println(Math.pow(2, 3)); // Elevado
		System.out.println(Math.sqrt(25)); // Raiz cuadrada
	}

}
