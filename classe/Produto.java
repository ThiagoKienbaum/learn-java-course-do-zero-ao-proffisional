package classe;

public class Produto {
	String nome;
	double preco;
	final static double DESCONTO = 0.25;
	
	Produto(){		
		
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;		
	}
	
	double precoComDesconto() {
		return preco * (1 - DESCONTO);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (DESCONTO + descontoDoGerente));
	}
}
