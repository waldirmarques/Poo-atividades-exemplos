package ufpb.br.AbstractFectory;

public class FabricaMacOS implements Fabrica {

	@Override
	public Janela criarJanela() {
		return new JanelaMacOs();
	}

	@Override
	public Menu criarMenu() {
		return new MenuMacOs();
	}

}
