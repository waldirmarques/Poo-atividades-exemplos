package ufpb.br.RevisaoPoliformismo;

public class Cachorro extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("AU AU AU");
		this.correndo();
	}
	
	public void correndo() {
		System.out.println("Correndo");
	}

}
