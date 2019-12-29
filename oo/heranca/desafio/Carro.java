package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAtual = 0;
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
	}

}
