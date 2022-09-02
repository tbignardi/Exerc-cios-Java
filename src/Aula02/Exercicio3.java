package Aula02;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		double precoUnitario, qtdeVendida, comissao;
		
		precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Preço unitário da peça: "));
		qtdeVendida = Double.parseDouble(JOptionPane.showInputDialog("Quantidade vendida: "));
		
		comissao = (precoUnitario * qtdeVendida) * 0.05;
		
		JOptionPane.showMessageDialog(null, "A comissão recebida será de: " + comissao);
	
	}

}
