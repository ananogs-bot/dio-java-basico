package Operadores;

public class Operadores4 {

	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 2;
		
		boolean simNao = n1==n2;
		System.out.println("n1 é igual a n2? " + simNao);
		
		
		simNao = n1 != n2;
		System.out.println("n1 é diferente de n2? " + simNao);
		
		simNao = n1 > n2;
		System.out.println("n1 é maior que n2? " + simNao);
		
		simNao = n1 < n2;
		System.out.println("n1 é menor que n2? " + simNao);
		
		
		
		String validacao = n1==n2 ? "n1 é igual a n2" : "n1 é diferente de n2";
		System.out.println(validacao);
		
		
		if(n1 < n2) {
			System.out.println("a nossa condição é verdadeira!");
		}
		
		
		String nome1 = "Ana";
		String nome2 = "Ana";
		
		System.out.println(nome1 == nome2);
		
		System.out.println(nome1.equals(nome2));
	}
	
}
