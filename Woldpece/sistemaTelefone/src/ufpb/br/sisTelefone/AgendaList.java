package ufpb.br.sisTelefone;

import java.util.ArrayList;
import java.util.List;

public class AgendaList implements Agenda {
	private List<Contato> contatos;
	
	public AgendaList() {
		this.contatos = new ArrayList<Contato>();
	}
	
	@Override
	public List<Contato> pesquisaContatosOperadora(String operadora) {
		List<Contato> lista = new ArrayList<Contato>();
		for(Contato c: this.contatos) {
			if(c.getOperadora().equals(operadora)) {
				lista.add(c);
			}
		}
		return lista;
	}

	@Override
	public void cadastraContato(Contato c) {
		this.contatos.add(c);
		
	}

	@Override
	public void apagaContato(String nomeContato) {
		for(Contato c: this.contatos) {
			if(c.getNome().equals(nomeContato)) {
				this.contatos.remove(c);
				break;
			}
		}		
	}

	@Override
	public Contato pesquisaContato(String nomeContato) {
		for(Contato c: this.contatos) {
			if(c.getNome().equals(nomeContato)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public String pesquisaOperadoraDeContato(String nomeContato) {
		for(Contato c: this.contatos) {
			if(c.getNome().equals(nomeContato)) {
				return c.getOperadora();
			}
		}
		return null;
	}
}
