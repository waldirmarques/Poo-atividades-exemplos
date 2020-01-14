package ufpb.br.Editora;

import java.util.ArrayList;

public class Editora {
	private EventoPublicado evento;
	private ArrayList<EditoraListener> arrayEvento;
	
	public Editora() {
		this.arrayEvento = new ArrayList<>();
	}
	
	public void publicaReportagem(EventoPublicado evento) {
		this.evento = evento;
		this.notificaReportagem();
	}
	
	public void publicaNoticia(EventoPublicado evento) {
		this.evento = evento;
		this.notificaNoticia();
	}
	
	public void addInteresado(EditoraListener  e) {
		if(!this.arrayEvento.contains(e)) {
			this.arrayEvento.add(e);
		}
	}
	
	public void removeInteresado(EditoraListener  e) {
		this.arrayEvento.remove(e);
	}

	private void notificaReportagem() {
		for(EditoraListener e: this.arrayEvento) {
			e.reportagem(evento);
		}	
	}
	
	private void notificaNoticia() {
		for(EditoraListener e: this.arrayEvento) {
			e.noticia(evento);
		}
	}
}
