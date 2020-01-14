package ufpb.br.AbstractFectory;

import org.junit.Test;

public class TesteGUI {
	
	@Test
	public void testeCriarTelaPrincipalGnome() {
		Cliente cliente = new ClienteGnome();
		cliente.montarTelaPrincipal();
	}

	@Test
	public void testeCriarTelaPrincipalMacOS() {
		Cliente cliente = new ClienteMacOS();
		cliente.montarTelaPrincipal();
	}

}
