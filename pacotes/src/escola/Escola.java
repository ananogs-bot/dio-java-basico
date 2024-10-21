package escola;

public class Escola {
	
	public static void main(String[] args) {
		
		Aluno felipe = new Aluno();
		
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setGenero("Masculino");
		
		System.out.println("Nome: " + felipe.getNome());
		System.out.println("Idade: " + felipe.getIdade());
		System.out.println("Gênero: " + felipe.getGenero());
	}
}
