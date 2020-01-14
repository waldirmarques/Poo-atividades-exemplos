package ufpb.br.dce.interfece;

public class Triangulo implements FiguraGeometrica{

	private double base;
	private double altura;
	
	public Triangulo(double base,double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double calculaArea() {
		return (this.base*this.altura)/2;
	}
	public String getNomeFigura() {
		return "Triangulo";
	}
	public String toString() {
		return "Área do Triangulo é de "+calculaArea()+" m²";
	}
}
