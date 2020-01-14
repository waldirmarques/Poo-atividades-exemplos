package ufpb.br.dce.interfece;

public class ProgramaDeFiguras {
	public static void main(String[]args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		Triangulo t1 = new Triangulo(5.0,5.0);
		gerente.adicionarFigura(t1);
		Losangulo l1 = new Losangulo(5.0,8.0);
		gerente.adicionarFigura(l1);
		Losangulo l2 = new Losangulo(5,5);
		gerente.adicionarFigura(l2);
		gerente.imprimeFigura();
		double total = gerente.calcularAreaTotalDeFiguras();
		System.out.println("Área total: "+total);
		double maiorArea = gerente.getMaiorAreaDeFigura();
		System.out.println("Maior Área : "+maiorArea);
	}
}
