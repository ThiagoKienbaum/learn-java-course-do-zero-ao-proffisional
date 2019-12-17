package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("\nDigite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\n\nNome: %s\nSobrenome: %s\nIdade: %d", nome, sobrenome, idade);
		
		entrada.close();
	}
}
