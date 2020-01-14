 package ufpb.br.FactoryMethod2;

public class PizzariaRT extends Pizzaria{

	@Override
	public Pizza criarPizza(String sabor) {
		Pizza p = null;
		if(sabor.equals("Mussarela")) {
			p = new Mussarela();
		}else if(sabor.equals("Calabresa")) {
			p = new Calabresa();
		}
		
		return p;
	}	
}
