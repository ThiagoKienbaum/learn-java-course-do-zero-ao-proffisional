package desfiosFinaisControle;

import java.util.Scanner;

public class soletrarPalavra {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a palavra a ser soletrada: ");
		String word = entrada.next();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		entrada.close();
	}
}
