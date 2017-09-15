package br.com.alura.java2;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}

	public void cobraRelatorios() {
		System.out.println("Preciso dos relatórios!");
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}

}
