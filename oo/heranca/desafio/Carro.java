package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	
	//Construtor	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	//Getters
	public int getVelocidadeAtual() {
		return velocidadeAtual;		
	}	
	
	//Setters
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}	
	
	//Metodos
	public void acelerar() {
		if (velocidadeAtual + 5 <= VELOCIDADE_MAXIMA) {
			velocidadeAtual += 5;			
		}
		else {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
		else {
			velocidadeAtual = 0;
		}
	}

}
