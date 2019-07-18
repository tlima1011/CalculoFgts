package br.com.tlmtech;

public class ValorFgts {

	private double valor;

	public ValorFgts() {

	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double calcular(double f) {
		if (f <= 5000) {
			f *= 0.35;
		} else if (f < 10000) {
			f *= 0.30;
		} else {
			f *= 0.10;
		}
		return (f);
	}
}
