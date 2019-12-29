package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Heroi();
		Monstro j2 = new Monstro();
		j2.x = 3;
		j2.y = 4;
		
		System.out.println("Jogador1 x " + j1.x + ", y " + j1.y + " HP " + j1.vida);
		System.out.println("Jogador2 x " + j2.x + ", y " + j2.y + " HP " + j2.vida);
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		
		j1.atacar(j2);
		
		System.out.println("Jogador1 x " + j1.x + ", y " + j1.y + " HP " + j1.vida);
		System.out.println("Jogador2 x " + j2.x + ", y " + j2.y + " HP " + j2.vida);
	}
}
