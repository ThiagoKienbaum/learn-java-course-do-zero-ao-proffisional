package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hello world".charAt(1));
		String s = "Hello World";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.equals("hello world"));
		System.out.println(s.equalsIgnoreCase("hello world"));
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("World"));
		
		var nome = "Thiago";
		var sobrenome = "Kienbaum";
		var idade = 29;
		var salario = 2002.45;
		
		System.out.println("\n\nNome: " + nome + "\nSobrenome: " + sobrenome 
				+ "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		System.out.printf("O senhor %s %s tem %d anos e recebe R$%.2f\n\n", nome, sobrenome, idade, salario);
				
	}
}
