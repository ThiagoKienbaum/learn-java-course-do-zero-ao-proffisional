package fundamentos.DesafiosFinaisFundamentos;

import java.util.Scanner;

public class CalculoAreaTriangulo {
	public static void main(String[] args) {
		//Formula A=(b*h)/2
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a base de um triangulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite a altura de um triangulo: ");
		double altura = entrada.nextDouble();
		
		System.out.println("A área do triangulo digitado é de: " + (base * altura)/2);
		
		entrada.close();
	}
}
