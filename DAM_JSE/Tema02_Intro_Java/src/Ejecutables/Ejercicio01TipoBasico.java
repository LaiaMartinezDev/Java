package Ejecutables;

public class Ejercicio01TipoBasico {
	/*
	 * 8 basic types; 4 enters, 2 reals, char, boolean
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The Attributes are written in lower case and without spaces if they have more than 1 word, but if you have 2 or more words the following are written in upper case
		// Classes are written without spaces and the first word of each letter is written with upper case
		// Methods start and finish with () with or without arguments: println("Hola"); salarioMensual(14); pow(2,3)
		// Constants are written with upper cases E, PX, MAX_VALUE
		
		byte age = 64, a=0, b=0; // Byte goes from -128 to 127
		//age = a + b; //its wrong, since a+b could be more than 127
		age = (byte)(a+b); // to cast a byte its not a good solution tho it gives a lot of problems
		
		
		short numberShort = 30_000; //Shot goes from 32_767
		
		int numberEnter = 2_000_000_000; //Int goes from 2Gb
		
		long numberLong = 1000; 
		long numberLong2 = 4_000_000_000L;
		
		System.out.println("la edad tiene : " + age); // Show age
		
		//If the number is less than int 2GB, if its larger its a long
		
		//REAL NUMBERS
		// Float (4 bytes)
		// Double (8 bytes)
		
		float numberFloat = 123;
		float numberFloat2 = 12.8F; // We add an F to convert the decimal into a float. This is an implicit cast
		numberFloat = (float)(12.2 +23.2); // This is an explicit  cast
		// When we have variables with decimals, we use double in order to avoid all this problems from above.
		double number1 = 12.3;
		double number2 = 234.8;
		
		number1 = number2*4;
		
		// char it only works for ONE character
		char letter = '3', character = '(';
		
		//Boolean: 2 states, true or false
		
		boolean yourMarried = true;
		boolean yourRich = false;
		
		
		

	}

}
