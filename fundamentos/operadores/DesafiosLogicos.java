package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		if (trabalho1 && trabalho2 == true) {
			System.out.println("Compre uma TV 50\" e tome sorvete.");
		}
		else if (trabalho1 ^ trabalho2 == true) {
			System.out.println("Compre uma TV 32\" e tome sorvete.");
		}
		else {
			System.out.println("Parabens vcs estão mais saudaveis e passando fome.");
		}
	}
}
