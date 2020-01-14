package ufpb.br.AbstractFectory;

public class ClienteGnome extends Cliente {

	@Override
	public Fabrica criarFabrica() {
		return new FabricaGnome();
	}

	
}
