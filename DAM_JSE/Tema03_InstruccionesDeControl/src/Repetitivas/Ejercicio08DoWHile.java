package Repetitivas;

public class Ejercicio08DoWHile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Mostrar los 10 primeros numeros impares
 *  - al final mostrar 
 *  - la suma y el producto
 *  - el primer numero impar es el 1
 */
		
		int suma = 0,  numero = 0, contador = 0;
		long producto = 1;
		
		do {
			System.out.println(numero);
		
			suma += numero;
			producto *= numero;
			
			numero += 2;
			contador++;
		}while(contador <= 10);
		
		System.out.println("*ESTADISTICAS*");	
		System.out.println("suma de todos:" + suma);
		System.out.println("producto de todos:" + producto);
	}

}
