package oo.desafio1;

public class Item {
	Produto produto;
	int quantidade;
	
	Item(Produto produto, int quantidade) {		
		this.produto = produto;
		this.quantidade = quantidade;		
	}
	
	public String toString() {
		return this.quantidade + " - " + this.produto.nome + " - R$" + this.produto.preco + "\n"; 
	}

}
