package ufpb.br.CtrlE;

import java.util.List;

public class Minicurso {
	private List<Participante> participantes;
	private int maxParticipantes;
	private String tituloMinurso;
	
	public Minicurso(String titulo, int maxParticipante) {
		this.tituloMinurso = titulo;
		this.maxParticipantes = maxParticipante;
	}
	
	public List<Participante> getParticipantes(){
		return this.participantes;
	}
	
	public void adicionarParticipante(Participante partecipante) {
		this.participantes.add(partecipante);
	}
	
	public int getMaxParticipante() {
		return this.maxParticipantes;
	}
	
	public String getTitulo() {
		return this.tituloMinurso;
	}
}
