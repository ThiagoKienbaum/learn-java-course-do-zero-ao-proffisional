package oo.heranca.desafio.main;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
	public static void main (String[] args) {
		Civic c1 = new Civic(170);
		Ferrari c2 = new Ferrari(306);
		
		System.out.println("Velocidade Civic: " + c1.getVelocidadeAtual() + "km/h");
		System.out.println("Velocidade Ferrari: " + c2.getVelocidadeAtual() + "km/h");
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.println("Velocidade Civic: " + c1.getVelocidadeAtual() + "km/h");
		System.out.println("Velocidade Ferrari: " + c2.getVelocidadeAtual() + "km/h");
		
		c1.frear();
		c2.frear();
		
		System.out.println("Velocidade Civic: " + c1.getVelocidadeAtual() + "km/h");
		System.out.println("Velocidade Ferrari: " + c2.getVelocidadeAtual() + "km/h");

		c1.frear();
		c2.frear();
		c1.frear();
		c2.frear();
		c1.frear();
		c2.frear();
		c1.frear();
		c2.frear();
		c1.frear();
		c2.frear();
		c1.frear();
		c2.frear();
		c1.frear();
		c2.frear();
		
		System.out.println("Velocidade Civic: " + c1.getVelocidadeAtual() + "km/h");
		System.out.println("Velocidade Ferrari: " + c2.getVelocidadeAtual() + "km/h");
	}
}
