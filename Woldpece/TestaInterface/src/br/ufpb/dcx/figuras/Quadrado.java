package br.ufpb.dcx.figuras;

public class Quadrado implements Figura{
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getlado() {
		return this.lado;
	}
	
	public double calcularArea() {
		return this.lado*this.lado;
	}
	
	
}
