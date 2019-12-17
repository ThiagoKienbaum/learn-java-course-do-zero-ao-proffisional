package fundamentos.DesafiosFinaisFundamentos;

public class CalculoBhaskara {
	public static void main(String[] args) {
		//Forumla encontrar o Delta Delta=b²-4ac
		
		double a = 1;
		double b = 12;
		double c = -13;
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.printf("O delta é: %f", delta);
	}
}
