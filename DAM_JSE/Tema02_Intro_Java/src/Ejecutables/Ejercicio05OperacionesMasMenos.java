
package Ejecutables;

public class Ejercicio05OperacionesMasMenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, contador = 7;
		
		a = contador++; // the value of a is 7 bc ++ goes after the contador, but the value of contador is 8 bc it has the ++
		
		System.out.println("a vale : " + a);
		System.out.println("contador vale: " + contador);
		
		
		contador = 7;
		a = ++contador;// the value of a is 8 bc ++ goes after the contador and the value of contador is 8 bc it has the ++
		System.out.println("a vale : " + a);
		System.out.println("contador vale: " + contador);
		

	}

}
