package Alternativas;

public class Ejercicio02IfSimpleDosRamas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 16;
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			System.out.println("Y puedo votar");
		} else {
			
			System.out.println("NO Eres mayor de edad");
			System.out.println("Y NO puedo votar");
		}
			
		System.out.println("FIN DEL PROCESO");
	
		
		boolean existe = false;
		if (existe) {
			System.out.println("Parce que existes : " + existe);
		} else {
			System.out.println("no existes : " + existe);
		}
		System.out.println("FIN DEL PROCESO");

	}

}
