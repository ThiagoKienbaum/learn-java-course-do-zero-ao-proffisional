package fundamentos.DesafiosFinaisFundamentos;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		//Formula IMC = Peso(KG) / Altura²(m)
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("O seu IMC é de: " + (peso / (Math.pow(altura, 2))));
		
		
		entrada.close();
	}
}
