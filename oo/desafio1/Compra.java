package oo.desafio1;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<>();
	
	void adcionarItens(Item item) {
		itens.add(item);		
	}
	
	double obterValorCompra() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
				
		return total;
	}
	
	public String toString() {
		String resultado = "";
		
		for(Item item: itens) {
			resultado += item;
		}
		
		return resultado;
	}
}
