package oo.composisao;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<>();
	
	String cliente;
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.itens.add(new Item(nome, quantidade, preco));		
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.preco * item.quantidade;
		}
		
		return total;
	}
}
