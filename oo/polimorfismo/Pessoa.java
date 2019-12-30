package oo.polimorfismo;

public class Pessoa {
	private double peso;
	
	//Construtor
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	//Getter
	public double getPeso() {
		return peso;
	}
	
	//Setter
	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;			
		}
	}
	
	//Metodos
	public void Comer(Comida comida) {
		this.peso += comida.getPeso();
	}
}
