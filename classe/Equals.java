package classe;

public class Equals {
	public static void main(String[] args) {
		EqualsUser u1 = new EqualsUser();
		u1.nome = "Thiago";
		u1.email = "thiago.kienbaum@hotmail.com";
		
		EqualsUser u2 = new EqualsUser();
		u2.nome = "Thiago";
		u2.email = "thiago.kienbaum@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));		
	}
}
