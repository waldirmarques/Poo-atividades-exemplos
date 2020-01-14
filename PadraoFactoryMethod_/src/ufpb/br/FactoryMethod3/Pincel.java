package ufpb.br.FactoryMethod3;

public class Pincel {
	
	public Pincel(String cor) {
		Cores c;
		FactoryCor f = new FactoryCor();
		
		c = f.getCor(cor);
		c.getCor();
		
		
	}
	
}
