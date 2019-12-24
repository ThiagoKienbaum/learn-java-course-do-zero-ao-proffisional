package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapaTreino {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Seya");
		usuarios.put(2, "Shiryu");
		usuarios.put(3, "Shun");
		usuarios.put(4, "Hyoga");
		usuarios.put(5, "Ikki");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Ikki") + "\n");
		
		for(int chave: usuarios.keySet()) {
			System.out.print("[" + chave + "]");
		}
		
		System.out.println("");
		
		for(String valor: usuarios.values()) {
			System.out.print("[" + valor + "]");
		}
		
		System.out.println("");
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print("[" + usuario.getKey() + " - ");
			System.out.print( usuario.getValue() + "]\n");
		}
	}
}