package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioMatriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Digite a quantidade de notas por aluno: ");
		int qtdNotas = entrada.nextInt();
		
		double[][] alunosNotas = new double[qtdAlunos][qtdNotas];
		double total = 0;
		
		for (int i = 0; i < qtdAlunos; i++) {
			for (int j = 0; j < qtdNotas; j++) {
				System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
				alunosNotas[i][j] = entrada.nextDouble();
				total += alunosNotas[i][j];
			}
		}
		
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.println("Essas são as notas do aluno " + (i + 1) + ": "+ Arrays.toString(alunosNotas[i]));
		}
		
		System.out.println("A média da turma é: " + total / (qtdAlunos * qtdNotas));
		
		entrada.close();
	}
}
