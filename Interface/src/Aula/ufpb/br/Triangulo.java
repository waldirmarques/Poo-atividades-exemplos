package Aula.ufpb.br;

public class Triangulo implements FiguraGeometrica{
	private double base;
	private double altura;
	
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double areaTri = this.base*this.altura/2;
		return areaTri;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = base*3;
		return perimetro;
	}

	@Override
	public String getNome() {
		return "Trianculo";
	}

}
