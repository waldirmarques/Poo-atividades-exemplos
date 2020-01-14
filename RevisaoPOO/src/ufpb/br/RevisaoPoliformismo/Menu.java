package ufpb.br.RevisaoPoliformismo;

import java.util.ArrayList;

public class Menu {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		Cavalo ca = new Cavalo();
		Andorinha an = new Andorinha();
		Canguro can = new Canguro();
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		animais.add(c);
		animais.add(g);
		animais.add(ca);
		animais.add(an);
		animais.add(can);
		
		for(Animal i: animais) {
			i.emitirSom();
		}

	}

}
