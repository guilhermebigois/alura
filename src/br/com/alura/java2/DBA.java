package br.com.alura.java2;

public class DBA extends Funcionario {
	
	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
