package AulaFabio.ufpb.br;

public class Passaro extends Animal {

	@Override
	public void emetirSom() {
		System.out.println("Cantando");
		this.levantarVou();
	}
	
	public void levantarVou() {
		System.out.println("Passaro Voando");
	}

}
