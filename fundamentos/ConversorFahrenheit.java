package fundamentos;

public class ConversorFahrenheit {
	
	public static void main(String[] args) {
		final int SUBTRACAO = 32;
		final double MULTIPLICACAO = 5/9.0;
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - SUBTRACAO) * MULTIPLICACAO;
		System.out.println("O resultado é " + celsius + "°C");
	}
}
