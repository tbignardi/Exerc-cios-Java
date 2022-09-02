package Aula02;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//declaração de variaveis
		double cotacaoDolar, valorDolar, valorReal;
		
		//entrada de dados
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dólar:"));
		valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Dólar:"));
		
		//processamento de dados
		valorReal = valorDolar * cotacaoDolar;
		
		//saída
		JOptionPane.showMessageDialog(null, "O valor convertido em reais é = " + valorReal);
		
		
			
	}

}
