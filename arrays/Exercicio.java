package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 8.4;
		notasAlunoA[2] = 9.2;
		notasAlunoA[3] = 6.4;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("A média do aluno A foi " + total / notasAlunoA.length + ".");
		
		total = 0;
		double[] notasAlunoB = {8, 3.5, 7.2, 9.5};
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];			
		}
		System.out.println("A média do aluno B foi " + total / notasAlunoB.length + ".");
	}
}
