
public class Principal {

	public static void main(String[] args) {
		System.out.println("Classe" + "\n" + 
							" Nome: sempre começo maiúscula = Principal || PrincipalFinal" + "\n" +
							" Tipo: sempre será .java = Principal.java" + "\n");
		
		System.out.println("Variáveis" + "\n" + 
							" Nome: classificação + começo sempre minúscula || minúscula e maiúscula = parametro e parametroNumerico" + "\n" +
							" Especificações do Nome: sem acento e caracteres especiais, apenas o $ e o _" + "\n" +
							" Classificações: String, byte, short, int, float, double, char, long e boolean" + "\n" + 
							" Tipo: se caso a varíavel não for mudar, colocar final na frente e o nome dela inteiro em maiúsculo" + "\n");
		
		int parametros = 1;
		int parametroNumerico = 2;
		
		final int PARAMETRO = 0;
		
		
		System.out.println("Métodos" + "\n" +
							"Forma: TipoRetorno + NomeNoInfinitivo + Parametro(s)" + "\n" +
							"Especificações: não é de bom tom fazer um método para duas ações");
		
		
		System.out.println("Concatenar: " + "\n" + "quando houver a concatenação entre números e String, haverá uma 'hierarquia', ou seja, a partir da String, concatena, antes disso, soma.");
		
	}	
}
