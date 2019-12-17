package desfiosFinaisControle;

import java.util.Scanner;

public class somaNumerosPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		double num = 0;
		
		while (num >= 0) {
			System.out.print("Digite um número para somar: ");
			num = entrada.nextDouble();
			if(num >= 0) {
				soma += num;				
			}			
		}
		System.out.println("A soma dos números é: " + soma + ".");
		entrada.close();
	}
}
