package Aula02;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		
		int numEleitores, brancos, nulos, validos;
		double totalValidos, totalBrancos, totalNulos;
		
		numEleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitores: "));
		
		brancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos brancos: "));
		
		nulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos nulos: "));

		validos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos válidos: "));
		
		totalValidos = (100*validos) /numEleitores;
		
		JOptionPane.showMessageDialog(null, "Porcentagem de votos válidos: " + totalValidos + "%");
		
		totalBrancos = (100*brancos) /numEleitores;
		
		JOptionPane.showMessageDialog(null, "Porcentagem de votos brancos: " + totalBrancos + "%");
		
		totalNulos = (100*nulos) /numEleitores;
		
		JOptionPane.showMessageDialog(null, "Porcentagem de votos nulos: " + totalNulos + "%");
				
	}

}
