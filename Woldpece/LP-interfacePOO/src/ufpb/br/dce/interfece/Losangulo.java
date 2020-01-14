package ufpb.br.dce.interfece;

public class Losangulo implements FiguraGeometrica {
	
	private double diagonalA;
	private double diagonalB;
	
	public Losangulo (double diagonalA, double diagonalB) {
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
	}
	public double calculaArea() {
		return(this.diagonalA*this.diagonalB)/2;
	}
	public String getNomeFigura() {
		return "Losangulo";
	}
	public String toString() {
		return "Área do Losangulo é de "+calculaArea()+" m²";
	}
}
