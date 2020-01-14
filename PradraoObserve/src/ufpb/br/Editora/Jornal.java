package ufpb.br.Editora;

public class Jornal implements EditoraListener {

	@Override
	public void reportagem(EventoPublicado evento) {
		System.out.println("Reportagem Recebida no jornal");
		
	}

	@Override
	public void noticia(EventoPublicado evento) {
		System.out.println("Noticia Recebida no jornal");
		
	}
	
}
