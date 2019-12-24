package oo.composisao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		
		compra1.cliente = "Thiago Kienbaum";
		
		compra1.adicionarItem("A torre negra", 2, 88.49);
		compra1.adicionarItem("Chamado de Cthulhu", 4, 43.27);
		compra1.adicionarItem("Guia do Mochileiro das Galaxias", 10, 23.42);
		
		System.out.println(compra1.cliente);
		System.out.println("Carrinho (" + compra1.itens.size() + ")");
		
		for(Item item: compra1.itens) {
			System.out.print(item.quantidade + " - ");
			System.out.print(item.nome + " - R$");
			System.out.println(item.preco);
		}		
		
		System.out.println("Total: R$" + compra1.obterValorTotal());				
	}
}
