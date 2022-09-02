package Aula02;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias;
		
		idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em anos: "));
		
		idadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses: "));
		
		idadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias: "));
		
		idadeDias = (idadeAnos*365 + idadeMeses) + idadeDias;
				
		JOptionPane.showMessageDialog(null, idadeDias);
		
		
	}

}
