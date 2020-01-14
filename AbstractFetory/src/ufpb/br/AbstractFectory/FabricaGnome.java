package ufpb.br.AbstractFectory;

public class FabricaGnome implements Fabrica {

	public Janela criarJanela() {
		return new JanelaGnome();
	}

	public Menu criarMenu() {
		return new MenuGnome();
	}

}
