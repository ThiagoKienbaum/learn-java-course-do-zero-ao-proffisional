package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<ListaUsuario> lista = new ArrayList<>();
		
		ListaUsuario u1 = new ListaUsuario("Aline");
		lista.add(u1);
		
		lista.add(new ListaUsuario("Thiago"));
		lista.add(new ListaUsuario("Willian"));
		lista.add(new ListaUsuario("Ana"));
		
		for (ListaUsuario u: lista) {
			System.out.println(u);			
		}
		
		System.out.println("\n" + lista.get(2) + "\n");
		
		lista.remove(2);
		System.out.println(lista.remove(new ListaUsuario("Ana")));
		
		System.out.println("\nTem?" + lista.contains(new ListaUsuario("Aline")) + "\n");
		
		for (ListaUsuario u: lista) {
			System.out.println(u);
		}
	}
}
