package Aula02;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
	
		double custoFabrica, porcentagemDistribuidor, impostos, resultado;
		
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica: "));
		
		porcentagemDistribuidor = custoFabrica*1.28;
		
		impostos = custoFabrica*1.45;
		
		resultado = custoFabrica+porcentagemDistribuidor+impostos;
		
		JOptionPane.showMessageDialog(null, "O preço final é: " + resultado);
		
		
	}

}
