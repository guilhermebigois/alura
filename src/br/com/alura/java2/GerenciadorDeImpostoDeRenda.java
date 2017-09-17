package br.com.alura.java2;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adicionar(Tributavel t) {
		System.out.println("Adicionando tributável: " + t);
		this.total += t.calcularTributos();
	}

	public double getTotal() {
		return total;
	}

}
