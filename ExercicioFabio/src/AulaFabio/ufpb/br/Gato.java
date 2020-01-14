package AulaFabio.ufpb.br;

public class Gato extends Animal{

	@Override
	public void emetirSom() {
		System.out.println("Meau Meau");
		this.correr();
	}
	
	public void correr() {
		System.out.println("O animal está correndo");
	}

}
