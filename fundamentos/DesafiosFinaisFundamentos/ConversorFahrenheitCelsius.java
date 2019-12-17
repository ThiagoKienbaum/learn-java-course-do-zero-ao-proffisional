package fundamentos.DesafiosFinaisFundamentos;

import java.util.Scanner;

public class ConversorFahrenheitCelsius {
	public static void main(String[] args) {
		//Formula (°F - 32) × 5/9 = °C

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		System.out.println(fahrenheit + "°F é equivalente à " + ((fahrenheit - 32) * (5.0/9.0)) + "°C");
		
		entrada.close();
	}
}
