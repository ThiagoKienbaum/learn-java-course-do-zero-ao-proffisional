package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num 1
		//Ler num 2
		// + - * / %
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite o operador desejado: ");
		String operador = entrada.next();
		
		double result = "+".equals(operador) ? num1 + num2 : 0;
		result = "-".equals(operador) ? num1 - num2 : result;
		result = "*".equals(operador) ? num1 * num2 : result;
		result = "/".equals(operador) ? num1 / num2 : result;
		
		System.out.printf("O resultado da operação é: %.2f", result);
		
		entrada.close();
	};
}
