package Operadores;

public class Operadores {
	public static void main(String[] args) {
		
		int numero = 5;
		
		System.out.println(- numero); //a - não modifica a variável
		System.out.println(numero); // não foi afetado
		
		numero = -numero;
		System.out.println(numero); //número ficou negativo
		
		
		numero = +numero;
		System.out.println(numero); //operadores lógicos se enquadram, precisamos negativar ele novamente
		
		
		numero = -numero;
		System.out.println(numero); //ou, multiplica ele por -1
		
		
	}
}
