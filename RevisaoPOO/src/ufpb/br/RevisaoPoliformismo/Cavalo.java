package ufpb.br.RevisaoPoliformismo;

public class Cavalo extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Rinchando, Richando");
		this.correndo();
	}
	
	public void correndo() {
		System.out.println("Correndo");
	}

}
