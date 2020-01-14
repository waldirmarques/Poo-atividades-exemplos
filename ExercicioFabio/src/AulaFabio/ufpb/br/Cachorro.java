package AulaFabio.ufpb.br;

public class Cachorro extends Animal {

	@Override
	public void emetirSom() {
		System.out.println("Au Au Au");
		this.correr();
	}
	
	public void correr() {
		System.out.println("O animal está correndo");
	}
	
}
