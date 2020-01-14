package ufpb.br.Telefone;

public class SecretariaEletronica implements TelefoneListener {

	@Override
	public void telefoneTocou(TelefoneEvent event) {
		System.out.println("Secretaria escuta o telefone tocando!");	
	}

	@Override
	public void telefoneAtendido(TelefoneEvent event) {
		System.out.println("Secretaria sabe que o telefone foi atendido!");
		
	}

}
