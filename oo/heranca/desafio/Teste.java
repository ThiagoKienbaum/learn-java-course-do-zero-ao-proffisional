package oo.heranca.desafio;

public class Teste {
	public static void main (String[] args) {
		Carro c1 = new Civic();
		Ferrari c2 = new Ferrari();
		
		System.out.println("Velocidade Civic: " + c1.velocidadeAtual);
		System.out.println("Velocidade Ferrari: " + c2.velocidadeAtual);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.println("Velocidade Civic: " + c1.velocidadeAtual);
		System.out.println("Velocidade Ferrari: " + c2.velocidadeAtual);
		
		c1.frear();
		c2.frear();
		
		System.out.println("Velocidade Civic: " + c1.velocidadeAtual);
		System.out.println("Velocidade Ferrari: " + c2.velocidadeAtual);

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
		
		System.out.println("Velocidade Civic: " + c1.velocidadeAtual);
		System.out.println("Velocidade Ferrari: " + c2.velocidadeAtual);
	}
}
