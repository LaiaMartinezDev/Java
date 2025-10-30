package Ejecutables;

public class Ejercicio09StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hola me llamo Tomas y soy tu profe.";
		
		//Method that returns a char value at the specified index
		System.out.println(frase.charAt(0));
		//Method that returns the length of the string
		System.out.println(frase.length());
		//Method that return the same string but with upper cases
		System.out.println(frase.toUpperCase());
	
		String fraseEnMayusculas = frase.toUpperCase(); 
		
		//Method that returns a substring of the main string. The substring begins with the character at the specified index and ends to the end of the string.
		System.out.println(frase.substring(5));
		
		//Method that returns a substring of the main string. The substring begins with the character at the specified beginindex and ends to the character at endindex.
		System.out.println(frase.substring(5,9)); // Before the 9th
		//Method that returns true if only this string contains the specified sequence of char values 
		System.out.println(frase.contains("soy"));
		
		//Method that test if the specified string starts with the specified prefix
		System.out.println(frase.startsWith("hola"));
		//Method that test if the specified string ends with the specified suffix
		System.out.println(frase.endsWith("profe"));
		
		//
		System.out.println(frase.toUpperCase().startsWith("HOLA"));
		
		//Method that compares the string to a specified object. It returns true if they are equals.
		String nombre = "Andres", nombre2 = "andres";
		System.out.println("Son iguales? " + nombre.equals(nombre2));
		//Method that compares this string to another string, ignoring case considerations.
		System.out.println("Son iguales por ignore " + nombre.equalsIgnoreCase(nombre2));
		
		//Method that returns the index within this string of the first occurrence of the specified substring.
		System.out.println(frase.indexOf("me"));
		System.out.println(frase.indexOf("Me")); //Giving a substring that does not exist it will return an impossible index
	}

}
