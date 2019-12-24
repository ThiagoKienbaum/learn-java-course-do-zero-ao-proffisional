package oo.desafio1;

public class teste {
	public static void main(String[] args) {	
		Produto produto1 = new Produto("Guitarra", 2432.28);
		Produto produto2 = new Produto("Bateria", 7463.63);
		Produto produto3 = new Produto("Contra-Baixo", 2752.78);
		
		Item item1 = new Item(produto1, 5);
		Item item2 = new Item(produto2, 8);
		Item item3 = new Item(produto3, 2);
		
		Compra compra1 = new Compra();
		compra1.adcionarItens(item1);
		compra1.adcionarItens(item2);
		Compra compra2 = new Compra();
		compra2.adcionarItens(item3);
		compra2.adcionarItens(item2);
		compra2.adcionarItens(item1);
		
		Cliente cliente1 = new Cliente("Thiago");
		cliente1.adicionarCompras(compra1);
		cliente1.adicionarCompras(compra2);
		
		System.out.println(cliente1.toString());		
	}
}
