package classe.desafioModulo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Aline";
		p1.peso = 80.0;
		//System.out.println(p1.comer());
		
		Pessoa p2 = new Pessoa("Thiago", 110);
		//System.out.println(p2.comer());
		
		Comida c1 = new Comida();
		c1.nome = "Pizza";
		c1.peso = 2.0;
		//System.out.printf("A %s tem %.1fKg.\n", c1.nome, c1.peso);
		
		Comida c2 = new Comida("Arroz", 0.8);
		//System.out.printf("O %s tem %.1fKg.\n", c2.nome, c2.peso);
		
		System.out.println(p1.comer(c1));
		System.out.println(p2.comer(c2));		
	}
}
