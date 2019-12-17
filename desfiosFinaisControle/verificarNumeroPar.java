package desfiosFinaisControle;

import java.util.Scanner;

public class verificarNumeroPar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println("O número " + i + " é par.");
			}
		}
		
		System.out.print("Digite um número: ");
		int num = keyboard.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número: " + num + " é par.");			
		}		
		keyboard.close();
	}
}

