package ufpb.br.FactoryMethod2;

public abstract class Pizza {
	
	public void assar() {
		System.out.println("A pizza esta assando!");
	}
	
	public void cortar() {
		System.out.println("A pizza esta sendo cortada!");
	}
	
	public void empacotar() {
		System.out.println("A pizza esta sendo empacotada");
	}
	
	public abstract String getSabor();
	
	
}
