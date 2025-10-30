package Ejecutables;

public class Ejercicio07Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math.random() gives a number between o and 0,99
		
		//We need to cast Math.random into an int because Math.random returns a double and if we are wanting and int number we need to cast it 
		//We put * 5 so it gives us a number between 0 and 4,99 in this case 4 since we cast it into an int, so we eliminate the decimals
		// We put the + 1, so it gives us a number between 1 and 5
		int aleatorio = (int) (Math.random() * 5 + 1);
		System.out.println(aleatorio);

	}

}
