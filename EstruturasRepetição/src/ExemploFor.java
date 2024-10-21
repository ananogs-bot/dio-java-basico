
public class ExemploFor {

	public static void main(String[] args) {

		for(int i = 1; i <= 20; i++) {
			System.out.println("Contando... " + i);
		}
		
		String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};
		
		
		//For
		System.out.println("\n");
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("O aluno no índice " + i + " é o aluno(a) " + alunos[i]);;
		}
		
		
		//For each
		for(String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
	}

}
