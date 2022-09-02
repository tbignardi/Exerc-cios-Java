package Aula02;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		
		double salarioAtual, reajuste;
		
		salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual: "));
		
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste: "));
		
		reajuste = salarioAtual*reajuste;
		
		JOptionPane.showMessageDialog(null, "O salário novo é: " + reajuste);

	}

}
