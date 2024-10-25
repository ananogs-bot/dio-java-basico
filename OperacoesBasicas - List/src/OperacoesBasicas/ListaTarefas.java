package OperacoesBasicas;
import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {

	private List<Tarefa> tarefaList;
	
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	
	public static void main(String[] args) {
		ListaTarefas lT = new ListaTarefas();
		
		System.out.println("O número total de elementos na lista é: " + lT.obterNumeroTotalTarefas());
		
		lT.adicionarTarefa("Tarefa 1");
		lT.adicionarTarefa("Tarefa 1");
		lT.adicionarTarefa("Tarefa 2");


		System.out.println("O nº total de elementos nessa lista é: " + lT.obterNumeroTotalTarefas());
		
		lT.removerTarefa("Tarefa 1");
		
	}
}
