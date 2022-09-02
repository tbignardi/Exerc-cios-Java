package Aula02;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inteiro: "));
		
		JOptionPane.showMessageDialog(null, numero-1);

	}

}
