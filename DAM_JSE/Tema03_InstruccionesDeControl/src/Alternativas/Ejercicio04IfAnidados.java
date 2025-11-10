package Alternativas;

public class Ejercicio04IfAnidados {
	
	/*Un Boolean estasCasado, un dpuble salario
	 * - Si estas casado aumentar salario 2% y ganas menos de 30000 aumento del 1%
	 * - Si no estas casado aumentar 1%
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean estasCasado = false;
		double salario = 30000;
		int aumento = 0;
		
		if (estasCasado) {
			aumento += 2;
			if(salario < 30000) {
				aumento++;
			}
			
		} else {
			aumento ++;
		}
		System.out.println("El aumento es :" + aumento);
	}

}
