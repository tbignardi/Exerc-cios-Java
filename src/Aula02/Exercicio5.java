package Aula02;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double base, altura, area;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		
		area = (base*altura);
		
		JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
		
	}

}
