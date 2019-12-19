package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHashSet {
	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		nums.add(3);
		nums.add(8);
		nums.add(14);
		nums.add(21);
		
		for (int n: nums) {
			System.out.println(n);
		}
		
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Aline");
		listaAprovados.add("Thiago");
		listaAprovados.add("Willian");
		listaAprovados.add("Ana");
		
		for (String candidatos: listaAprovados) {
			System.out.println(candidatos);
		}
	}
}
