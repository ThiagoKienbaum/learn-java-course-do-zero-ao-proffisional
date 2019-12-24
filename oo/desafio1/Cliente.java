package oo.desafio1;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompras(Compra compra) {
		compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorCompra();
		}		
		return total;
	}
	
	public String toString() {
		String resultado = "Cliente: " + this.nome + "\nQtd / Descrição / Valor Un.\n";
		
		for(Compra compra: compras) {
			resultado += compra.toString();
		}
		
		resultado += "\nTotal dos pedidos: \nR$ " + obterValorTotal();
		
		return resultado;
	}

}
