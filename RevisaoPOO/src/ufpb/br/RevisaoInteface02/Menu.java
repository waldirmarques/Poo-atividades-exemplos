package ufpb.br.RevisaoInteface02;

import java.util.ArrayList;

public class Menu{

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado(20);
		Circulo c = new Circulo(3.2);
		Retangulo r = new Retangulo(21,43);
		
		ArrayList <AreaCalculavel> areas = new ArrayList<>();

		areas.add(q);
		areas.add(c);
		areas.add(r);
		
		for(AreaCalculavel i: areas) {
			i.calculaArea();
			System.out.println(i.toString());
		}
	}
}
