package Aula02;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeDias;
		
		idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em anos: "));
		
		idadeDias = (idadeAnos*365);
		
		JOptionPane.showMessageDialog(null, idadeDias);
		
	}

}
