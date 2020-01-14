package ufpb.br.Editora;

import java.util.ArrayList;

public class Portal extends EditoraAdapter {
	private EventoPublicado evento;
	private ArrayList<PaginaListener> paginas;
	
	public Portal() {
		this.paginas = new ArrayList<>();
	}
	
	@Override
	public void noticia(EventoPublicado evento) {	
		System.out.println("Noticia Recebida no Portal");
		this.notificaPagina();
	}

	@Override
	public void reportagem(EventoPublicado evento) {
		System.out.println("Pagina Recebida no Portal");
		this.notificaPagina();
	}
	
	public void addPagina(PaginaListener e) {
		if(!this.paginas.contains(e)) {
			this.paginas.add(e);
		}
	}
	
	private void notificaPagina() {
		for(PaginaListener i: this.paginas) {
			i.publicaPagina(evento);
		}
	}

}
