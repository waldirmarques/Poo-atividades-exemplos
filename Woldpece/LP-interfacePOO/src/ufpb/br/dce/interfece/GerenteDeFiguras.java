package ufpb.br.dce.interfece;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;
	
	public GerenteDeFiguras() {
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void adicionarFigura(FiguraGeometrica figura) {
		this.figuras.add(figura);
	}
	
	public double calcularAreaTotalDeFiguras() {
		double total = 0;
		for(FiguraGeometrica figura:this.figuras) {
			total+=figura.calculaArea();
		}
		return total;
	}
	
	public List<FiguraGeometrica> getFiguras() {
		return this.figuras;		
	}
	
	public void imprimeFigura() {
		for(FiguraGeometrica figuras:this.figuras) {
			System.out.println(figuras.getNomeFigura());
		}
	}
	
	public double getMaiorAreaDeFigura() {
		double Maior = this.figuras.get(0).calculaArea();
		for(FiguraGeometrica figura:this.figuras) {
			if(figura.calculaArea() > Maior) {
				Maior = figura.calculaArea();
			}
		}
		return Maior;
	}
}
