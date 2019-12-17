package desfiosFinaisControle;

import java.util.Scanner;

public class calculoMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media <= 10 && media >= 0) {
			if(media >= 7) {
				System.out.println("Aprovado");
			}
			else if(media >= 4) {
				System.out.println("Em recuperação");
			}
			else {
				System.out.println("Reprovado");
			}
		}
		else {
			System.out.println("As notas digitadas são invalidas.");
		}
			
		
		entrada.close();
	}
}
