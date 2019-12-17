package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo numero");
		
		System.out.println(valor1 + valor2);
	}

}
