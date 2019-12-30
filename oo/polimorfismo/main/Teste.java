package oo.polimorfismo.main;

import oo.polimorfismo.Arroz;
import oo.polimorfismo.Feijao;
import oo.polimorfismo.Pessoa;
import oo.polimorfismo.Sorvete;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(70);
		
		Arroz c1 = new Arroz(0.3);
		Feijao c2 = new Feijao(0.2);
		Sorvete c3 = new Sorvete(0.4);
		
		System.out.println(p1.getPeso());
		
		p1.Comer(c1);
		p1.Comer(c2);
		p1.Comer(c3);
		
		System.out.println(p1.getPeso());
	}
}
