package Aula02;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
	
		double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, resultado;
				
		primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		terceiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
		quartoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número: "));
		
		resultado = (primeiroNumero*primeiroNumero) + (segundoNumero*segundoNumero) + (terceiroNumero*terceiroNumero) + (quartoNumero*quartoNumero);
		
		JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " + resultado);
		
		
	}

}
