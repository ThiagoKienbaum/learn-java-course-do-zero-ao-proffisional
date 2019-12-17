package classe;

public class EqualsUser {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		if (objeto instanceof EqualsUser) {
			EqualsUser outro = (EqualsUser) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}
		else {
			return false;
		}
	}
}
