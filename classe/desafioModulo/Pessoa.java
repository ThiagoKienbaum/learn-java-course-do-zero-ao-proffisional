package classe.desafioModulo;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(){
		
	}
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	String comer(Comida comida) {
		double pesoFinal = peso + comida.peso;
		return String.format("Após comer, %s ficou com %.1fKg.", nome, pesoFinal);
	}
}
