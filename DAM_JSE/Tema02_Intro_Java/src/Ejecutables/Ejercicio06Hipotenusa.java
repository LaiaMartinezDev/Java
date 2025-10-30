package Ejecutables;

public class Ejercicio06Hipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hipotenusa^2 = cateto1^2 + cateto2^2
		//Hipotenusa = arrel quadrada(cateto1^2 + cateto2^2)
		
		double hipotenusa = 0, cateto1 = 4, cateto2 = 3;
		
		//Math.sqrt calculates the "arrel quadrada"
		
		hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		System.out.println(hipotenusa);
		
		//Math.pow eleva the number
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) +Math.pow(cateto2,2));
		System.out.println(hipotenusa);

	}

}
