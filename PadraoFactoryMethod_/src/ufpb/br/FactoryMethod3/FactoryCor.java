package ufpb.br.FactoryMethod3;

public class FactoryCor {
	
	public Cores getCor(String cor) {
		Cores c = null;
		if(cor.equals("Azul")) {
			return c = new Azul();
		}else {
			return c = new Vermelho();
		}
	}
	
}
