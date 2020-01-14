package Aula.ufpb.br;

public class Quadrado implements FiguraGeometrica{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double res = Math.pow(this.lado, 2);
		return res;
		
	}

	@Override
	public double calcularPerimetro() {
		double perimetroQuadrado = this.lado*4;
		return perimetroQuadrado;
	}

	@Override
	public String getNome() {
		return "Quadrado";
	}

	public double getLado() {
		return lado;
	}
}
