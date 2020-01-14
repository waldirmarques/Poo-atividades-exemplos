package ufpb.br.RevisaoInteface02;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Area do Circulo = "+this.calculaArea() ;
	}

	@Override
	public double calculaArea() {
		double pi = 3.14;
		return pi*(Math.pow(raio, 2));
	}
}
