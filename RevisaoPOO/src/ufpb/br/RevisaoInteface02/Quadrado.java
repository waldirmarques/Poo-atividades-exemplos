package ufpb.br.RevisaoInteface02;

public class Quadrado implements AreaCalculavel {
	private double lado;	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Area do Quadrado = "+this.calculaArea() ;
	}

	@Override
	public double calculaArea() {
		return Math.pow(lado, 2); 
		
	}

}
