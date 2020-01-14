package ufpb.br.FactoryMethod2;

public abstract class Pizzaria {
	
	public Pizza pedindoPizza(String sabor) {
		Pizza p = criarPizza(sabor);
		
		p.assar();
		p.cortar();
		p.empacotar();
		
		return p;
		
	}
	
	public abstract Pizza criarPizza(String sabor);
}
