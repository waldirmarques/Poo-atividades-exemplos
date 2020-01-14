package ufpb.br.exercicioJava02;

public class Livro extends CoisasDaLoja {
	private String autor;
	
	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
