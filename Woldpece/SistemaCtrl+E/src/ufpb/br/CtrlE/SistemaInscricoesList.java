package ufpb.br.CtrlE;

import java.util.ArrayList;
import java.util.List;

import ufpb.br.SisInscrição.Endereco;

public class SistemaInscricoesList implements SistemaInscricoes {
	private List<Participante> participantes;
	private List<Minicurso> minicusos;
	
	public SistemaInscricoesList() {
		this.participantes = new ArrayList<Participante>();
		this.minicusos = new ArrayList<Minicurso>();
	}
	
	public void cadastrarParticipante(Participante participante) {
		this.participantes.add(participante);
	}
	
	public List<Participante> pesquisaParticipantesDoInstituicao(String nomeInstituicao){
		List<Participante> lista = new ArrayList<Participante>();
		for(Participante p: this.participantes) {
			if(p.getInstituicao().equals(nomeInstituicao)) {
				lista.add(p);
			}
		}
		return lista;
	}
	
	public List<Participante> pesquisaParticipantesDoEstado(String estado){
		List<Participante> lista = new ArrayList<Participante>();
		for(Participante p: this.participantes) {
			Endereco est = p.getEndereco();
			if(est.getEstado().equals(estado)) {
				lista.add(p);
			}
		}
		return lista;
	}
	public Participante pesquisaParticipante(String emailParticipante) {
		for(Participante p : this.participantes) {
			if(p.getEmail().equals(emailParticipante)) {
				return p;
			}
		}
		return null;
	}
	public void inscreveParticipanteEmMinicurso(String emailParticipante,String tituloMinicurso) {
		this.minicusos.add(emailParticipante);
	}
}
