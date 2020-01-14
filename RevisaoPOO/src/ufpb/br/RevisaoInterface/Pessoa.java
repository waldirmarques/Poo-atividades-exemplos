package ufpb.br.RevisaoInterface;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;	
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getSexo() {
		return sexo;
	}	
}
