package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Recebe os 3 salario em formato string
		System.out.println("Digite o primeiro salario");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		//Converte String para Double
		Double sal1 = Double.parseDouble(salario1);
		Double sal2 = Double.parseDouble(salario2);
		Double sal3 = Double.parseDouble(salario3);
		
		//Calcula a media de salarios
		double mediaSalario = (sal1 + sal2 + sal3)/3;
		
		System.out.printf("A média de salarios é: R$%.2f", mediaSalario);
		
		entrada.close();
	}

}
