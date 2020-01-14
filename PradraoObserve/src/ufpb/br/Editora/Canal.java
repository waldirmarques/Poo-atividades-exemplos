package ufpb.br.Editora;

public class Canal extends EditoraAdapter implements PaginaListener{

	@Override
	public void noticia(EventoPublicado evento) {
		System.out.println("Noticia Recebida no Canal");
	}

	@Override
	public void publicaPagina(EventoPublicado pagina) {
		System.out.println("Pagina Recebida no Canal");	
	}

}
