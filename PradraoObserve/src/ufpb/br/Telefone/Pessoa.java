package ufpb.br.Telefone;

public class Pessoa extends TelefoneAdapter {
	
	public void telefoneTocou(TelefoneEvent event) {
		System.out.println("Eu pego!");
	}
}
