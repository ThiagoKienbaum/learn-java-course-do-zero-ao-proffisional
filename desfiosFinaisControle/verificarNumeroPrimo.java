package desfiosFinaisControle;

import java.util.Scanner;

public class verificarNumeroPrimo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		int contDivisores = 0;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				contDivisores++;
			}
		}
		
		if(contDivisores == 0) {
			System.out.println("O número " + num + " é primo.");
		} 
		else {
			System.out.println("O número " + num + " não é primo.");
		}
		
		entrada.close();		
	}
}
