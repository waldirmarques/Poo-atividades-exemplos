package AulaFabio.ufpb.br;

public class Cavalo extends Animal {

	@Override
	public void emetirSom() {
		System.out.println("Rincho Rincho");
		this.correr();
	}
	
	public void correr() {
		System.out.println("O animal está correndo");
	}

}
