package oo.heranca.desafio;

public class Ferrari extends Carro {
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	@Override
	public void acelerar() {
		velocidadeAtual += 15;
	}
}
