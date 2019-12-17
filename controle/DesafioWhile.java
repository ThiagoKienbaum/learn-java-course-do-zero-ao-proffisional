package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double nota = 0; 
		int contador = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				contador++;
			}else if (nota != -1){
				System.out.println("Digite uma nota valida");
			}
		}
		
		System.out.println("O total de notas digitadas foi " + contador + ", com a somatória total de "
				+ total + " e média de " + total/contador);
		
		entrada.close();
	}
}
