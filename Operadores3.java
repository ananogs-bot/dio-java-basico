package Operadores;

public class Operadores3 {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 5;
		b = 6;
		
		String resultado_1 = "";
		if(a==b) {
			resultado_1 = "verdadeiro";
		} else {
			resultado_1 = "falso";
		}
		
		//ou com a expressão booleana
		
		String resultado = a==b ? "verdadeiro" : "falso";
		
		System.out.println(resultado);

	}

}
