package desfiosFinaisControle;

import java.util.Scanner;

public class conferirAnoBisexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) {			
			System.out.println("O ano " + ano + " é bisexto");			
		}
		else if (ano % 400 == 0) {			
			System.out.println("O ano " + ano + " é bisexto");			
		}
		else {
		System.out.println("O ano " + ano + " não é bisexto");
		}
				
		entrada.close();
	}
}
