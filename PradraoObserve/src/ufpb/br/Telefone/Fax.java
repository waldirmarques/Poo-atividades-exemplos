package ufpb.br.Telefone;

public class Fax extends TelefoneAdapter{
	
	public void telefoneAtendido(TelefoneEvent event) {
		System.out.println("Fax telefone atendido!");
	}
}
