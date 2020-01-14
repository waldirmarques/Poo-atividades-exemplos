package ufpb.br.Telefone;

public class Menu {

	public static void main(String[] args) {
		Telefone fone = new Telefone();
		Pessoa pessoa = new Pessoa();
		SecretariaEletronica se = new SecretariaEletronica();
		
		fone.addListiner(se);
		
		fone.tocaTelefone();
		pessoa.telefoneTocou(fone.getEvent());
		fone.atendeTelefone();

	}

}
