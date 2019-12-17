package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "computador";
		p1.preco = 3780.00;
		
		System.out.println(p1.precoComDesconto());
		
		Produto p2 = new Produto("smartphone", 1199.00);
		
		System.out.println(p2.precoComDesconto(0.05));		
	}
}
