package Ejecutables;

public class Ejercicio02TiposBasicosComunes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// They contain
		int number1 = 0, number2 = 8, number3 = 0;
		long isbn = 111111111111111L; // Longer than the precision so thats why we put L
		long isbn2 = 112; // In this one we  don't pass the precision, thats why we don't put the L
		
		double salary = 12_345.56;
	
		char letter = 'r';
		
		boolean exist = false;
		
		
		// Do not contain
		String name = "Thomas"; // Its a class. The class has a data and a lot of methods that you can do with it
		name = "Andres";
		
		System.out.println(name);

	}

}
