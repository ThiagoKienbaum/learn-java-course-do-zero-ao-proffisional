package controle;

import java.util.Scanner;
import java.util.Arrays;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] words = new String[] {"a","b","c","d"};
		int i = 0;
		
		System.out.println(Arrays.toString(words));
		
		while(!words[i].equalsIgnoreCase("sair")) {
			System.out.print("Digite uma palavra: ");
			words[i] = entrada.next();
		}
		
		System.out.println(Arrays.toString(words));
		entrada.close();
	}
}
