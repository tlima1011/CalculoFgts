package br.com.tlmtech.teste;

import javax.swing.JOptionPane;

import br.com.tlmtech.ValorFgts;

public class FGTS {

	public static void main(String[] args) {
		//Cálculo do FGTS a partir do ministério da Economia
		//Entrada de dados
		ValorFgts valor = new ValorFgts();
		double resgate, fgts;
		fgts = Double.parseDouble(JOptionPane.showInputDialog("Valor do FGTS depositado:"));
		//Processamento com passagem de parâmetros
		resgate = valor.calcular(fgts);
		//Saída depois do cálculo
		JOptionPane.showMessageDialog(null, "Valor a ser resgatado em R$" + resgate);
		System.out.println("Valor a ser resgatado em R$" + resgate);
	}
}
