package br.com.alura.java2;

public class TestaAutenticacao {
	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		diretor.autentica(123);
		SistemaInterno sistemaInterno = new SistemaInterno();
		Autenticavel autenticavel = diretor;
		sistemaInterno.autentica(autenticavel);
	}

}
