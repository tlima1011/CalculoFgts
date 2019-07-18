package br.com.tlmtech.teste;

import javax.swing.JOptionPane;

import br.com.tlmtech.ValorFgts;

public class FGTS {

	public static void main(String[] args) {
		//C�lculo do FGTS a partir do minist�rio da Economia
		//Entrada de dados
		ValorFgts valor = new ValorFgts();
		double resgate, fgts;
		fgts = Double.parseDouble(JOptionPane.showInputDialog("Valor do FGTS depositado:"));
		//Processamento com passagem de par�metros
		resgate = valor.calcular(fgts);
		//Sa�da depois do c�lculo
		JOptionPane.showMessageDialog(null, "Valor a ser resgatado em R$" + resgate);
		System.out.println("Valor a ser resgatado em R$" + resgate);
	}
}
