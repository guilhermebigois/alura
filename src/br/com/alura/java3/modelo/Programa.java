package br.com.alura.java3.modelo;

public class Programa implements Runnable {

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
	}
	
}
