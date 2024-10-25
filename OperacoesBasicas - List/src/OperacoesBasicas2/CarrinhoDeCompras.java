package OperacoesBasicas2;
import java.util.List;

import OperacoesBasicas.Tarefa;

import java.util.ArrayList;

public class CarrinhoDeCompras {

	private List<Item> itemList;
	
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		
		itemList.removeAll(itemParaRemover);
	}
	
	
	public void calcularValorTotal() {
		double total = 0;
		
		
		for(Item i: itemList) {
			
			double precoT = i.getPreco() * i.getQuantidade();
			
			total += precoT;
		}
		
		System.out.println("Valor Total: " + total);

	}
	
	
	public void exibirItens() {
		System.out.println("\nLista de Itens:\n");
		
		for(Item i: itemList) {
			System.out.println(i.getNome());
		}
	}
	
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras cDC = new CarrinhoDeCompras();
		
		cDC.adicionarItem("maça", 2.8, 2);
		cDC.adicionarItem("arroz", 5.4, 3);
		
		cDC.adicionarItem("oreo", 5.2, 5);
		cDC.removerItem("oreo");
		
		cDC.calcularValorTotal();
		
		cDC.exibirItens();
	}
}
