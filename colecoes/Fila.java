package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		fila.add("Thiago");
		fila.add("Willian");
		fila.add("Gordo");

		fila.offer("Aline");
		fila.offer("Ana");
		fila.offer("Cassia");
		
		System.out.println(fila.peek());
		System.out.println(fila.element() + "\n");
		
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
