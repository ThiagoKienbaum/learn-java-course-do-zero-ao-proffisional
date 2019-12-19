package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		
		stack.add("Magma Spray");
		stack.push("Brave the Elements");
		stack.push("Counterspell");
		
		System.out.println(stack.peek());
		System.out.println(stack.element() + "\n");
		
		System.out.println(stack.pop());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		
	}
}
