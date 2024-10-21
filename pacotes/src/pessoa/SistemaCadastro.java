package pessoa;

public class SistemaCadastro {

	public static void main(String[] args) {
		
		String nome = "Ana";
		String cpf = "123456789";
		
		Pessoa p1 = new Pessoa(nome, cpf);
		
		Pessoa p2 = new Pessoa("Maria", "12453134");
		
		System.out.println(p1.getNome() + " " + p1.getCpf());
		
	}
}
