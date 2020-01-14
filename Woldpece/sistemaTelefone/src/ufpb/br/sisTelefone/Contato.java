package ufpb.br.sisTelefone;

public class Contato {
	private String nome;
	private String numero;
	private String operadora;
	
	public Contato() {
		this.nome = "";
		this.numero = "";
		this.operadora = "";
	}
	public Contato(String nome, String numero, String operadora) {
		this.nome = nome;
		this.numero = numero;
		this.operadora = operadora;
	}
	
	public String toString() {
		return "Nome do contato: "+this.nome+
				"\nNúmero do contato: "+this.numero+
				"\nOperadora: "+this.operadora;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getOperadora() {
		return this.operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
}
