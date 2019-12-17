package desfiosFinaisControle;

import java.util.Scanner;

public class verificarNumeroPrimoSwitch {
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
		
		switch(contDivisores) {
		case 0:
			System.out.println("O número " + num + " é primo.");
			break;
		default:
			System.out.println("O número " + num + " não é primo.");
			break;		
		}
		
		entrada.close();		
	}
}
