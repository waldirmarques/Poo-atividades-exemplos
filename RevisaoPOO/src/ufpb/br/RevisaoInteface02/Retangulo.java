package ufpb.br.RevisaoInteface02;

public class Retangulo implements AreaCalculavel {
	private double base;
	private double altura;
		
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Area do Retangulo = "+this.calculaArea() ;
	}

	@Override
	public double calculaArea() {
		return this.base*this.altura;
	}
}
