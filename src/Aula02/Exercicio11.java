package Aula02;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		double salarioFixo, numVendas, comissaoFixa, valorVendas, comissao5;
		
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
		
		numVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de vendas: "));
		
		comissaoFixa = (salarioFixo+numVendas)*1.02;
		
		valorVendas = salarioFixo+comissaoFixa;
		
		comissao5 = valorVendas*1.5;
		
		JOptionPane.showMessageDialog(null, "Salário final: " + comissao5);
		
	}
	
	

}
