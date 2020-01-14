package br.ufpb.dcx.figuras;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeArea {
	public static void main(String[]args) {
		
		List<Figura> figuras = new ArrayList<Figura>();
		
		
		Quadrado areaQuadrado = new Quadrado(5);
		Quadrado areaQuadrado2 = new Quadrado(6);
		Triangulo areaTriangulo = new Triangulo(2,3);
		Triangulo areaTriangulo2 = new Triangulo(5,6);
		
		figuras.add(areaQuadrado);
		figuras.add(areaQuadrado2);
		figuras.add(areaTriangulo);
		figuras.add(areaTriangulo2);
		double soma = 0;
		for(Figura f: figuras) {
			double area = f.calcularArea();
			System.out.println("Area Calculada: "+area);
		}
		
		System.out.println("A Area do total: "+soma);
		
	}
}
