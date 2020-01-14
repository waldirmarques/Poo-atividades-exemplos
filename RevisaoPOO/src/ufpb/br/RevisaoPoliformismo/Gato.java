package ufpb.br.RevisaoPoliformismo;

public class Gato extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("MIAU MIAU");
		this.correndo();
	}
	
	public void correndo() {
		System.out.println("Correndo");
	}

}
