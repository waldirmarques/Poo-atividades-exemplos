package Aula.ufpb.br;

public class Menu {
	public static void main(String[]args) {
		
		Quadrado q = new Quadrado(40);
		Triangulo t = new Triangulo(5,2);
		
		FiguraGeometrica l[] = {q,t};
		System.out.println(l[0].calcularArea());
		System.out.println(l[1].calcularPerimetro());
		System.out.println(l[0].getNome());
		
	}
}
