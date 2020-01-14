package ufpb.br.Editora;

public class EventoPublicado {
	private String titulo;
	private String assunto;
	
	public EventoPublicado(String titulo, String assunto) {
		this.titulo = titulo;
		this.assunto = assunto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	
	
}
