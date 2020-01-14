package ufpb.br.AbstractFectory;

public class ClienteMacOS extends Cliente {
	@Override
	public Fabrica criarFabrica() {
		return new FabricaMacOS();
	}

	}
