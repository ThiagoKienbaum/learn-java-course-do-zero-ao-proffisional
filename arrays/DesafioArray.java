package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de notas que serão informadas: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.print("Digite a nota número " + (i + 1) + ": ");
			double nota = entrada.nextDouble();
			if(nota >= 0 && nota <= 10) {
				notas[i] = nota;
			}
			else {
				System.out.println("Nota invalida");
				break;
			}			
		}
		
		System.out.println("As notas digitadas foram: " + Arrays.toString(notas));
		
		System.out.print("Deseja calcular a média? (S/N)");
		String resposta = entrada.next();
		
		if (resposta.equalsIgnoreCase("S")) {
			double total = 0;
			for (double nota: notas) {
				total += nota;
			}
			System.out.println("A média final do aluno é: " + total / notas.length);
		}
		
		entrada.close();
	}
}
