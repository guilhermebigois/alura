package br.com.alura.java3.modelo;

public class ContaCorrente implements Tributavel {
	private double saldo;

	@Override
	public double calcularTributos() {
		return saldo * 0.01;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

}
