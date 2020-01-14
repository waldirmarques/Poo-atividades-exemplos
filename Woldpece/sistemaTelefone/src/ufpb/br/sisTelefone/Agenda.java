package ufpb.br.sisTelefone;

import java.util.List;

public interface Agenda {
	public void cadastraContato(Contato c);

	public void apagaContato(String nomeContato);

	public List<Contato> pesquisaContatosOperadora(String operadora);

	public Contato pesquisaContato(String nomeContato);

	public String pesquisaOperadoraDeContato(String nomeContato);
}