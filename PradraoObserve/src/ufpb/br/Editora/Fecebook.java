package ufpb.br.Editora;

public class Fecebook extends EditoraAdapter implements PaginaListener {

	@Override
	public void noticia(EventoPublicado evento) {
		System.out.println("Noticia Recebida no Fecebook");		
	}

	@Override
	public void publicaPagina(EventoPublicado pagina) {
		System.out.println("Pagina recebida no Fecebook");
		
	}

}
