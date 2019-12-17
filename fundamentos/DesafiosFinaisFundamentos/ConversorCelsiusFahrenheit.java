package fundamentos.DesafiosFinaisFundamentos;

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
	public static void main(String[] args) {
		//Formula
		//°F = °C × 1, 8 + 32
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius");
		double celsius = entrada.nextDouble();
//		double fahrenheit = celsius * 1,8 + 32;
		
		System.out.println( celsius + "°C é equivalente à " + ((celsius * 1.8) + 32) + "°F");
		
		entrada.close();
	}
}
