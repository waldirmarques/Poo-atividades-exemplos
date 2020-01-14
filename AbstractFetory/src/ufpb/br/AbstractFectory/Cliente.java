package ufpb.br.AbstractFectory;

public abstract class Cliente {
	
	public abstract Fabrica criarFabrica();

	public void montarTelaPrincipal() {
		Fabrica fabrica = criarFabrica();
		Janela janela = fabrica.criarJanela();
		janela.addMenu(fabrica.criarMenu());

	}
}
