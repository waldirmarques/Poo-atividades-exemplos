package ufpb.br.SisInscrição;

import java.util.ArrayList;

public class sistemaInscricoes{ 
	private ArrayList<Participantes> ListaParticipantes;
	
	public sistemaInscricoes() {
		ListaParticipantes = new ArrayList<Participantes>();
	}
	
	public void cadastraParticipante(Participantes Participante) {
		this.ListaParticipantes.add(Participante);
	}
	
	public void removerParticipante(String EmailParticipante) {
		
		for(int k = 0;k<this.ListaParticipantes.size();k++) {
			if(this.ListaParticipantes.get(k).getEmail().equals(EmailParticipante)) {
				this.ListaParticipantes.remove(k);
			}
		}
	}
	
	public ArrayList<Participantes> pesquisaParticipantesDaInstituicao(String nomeInstituicao) {
		ArrayList<Participantes> listInstituicao = new ArrayList<Participantes>();
		
		for(Participantes instituicao: this.ListaParticipantes) {
			if(instituicao.getInstituicao().equals(nomeInstituicao)) {
				listInstituicao.add(instituicao);
			}
		}
		return listInstituicao;
	}
	
	public ArrayList<Participantes> pesquisaparticipantesDoEstado(String nomeEstado){
		
		ArrayList<Participantes> listEstados = new ArrayList<Participantes>();
		
		for(Participantes estado: this.ListaParticipantes) {
			Endereco est = estado.getEndereco();
			if(est.getEstado().equals(nomeEstado)) {
				listEstados.add(estado);
			}
		}
		return listEstados;
	}
	
	public Participantes pesquisaParticipante(String EmailParticipante) {
		Participantes res = new Participantes();
		
		for(int k = 0; k<ListaParticipantes.size();k++) {
			if(res.getEmail().equals(EmailParticipante)) {
				return this.ListaParticipantes.get(k);
			}
		}
		return res;
	}
	public ArrayList<Participantes> getListaTotalDeParticipantes(){
		return this.ListaParticipantes;
	}
}

