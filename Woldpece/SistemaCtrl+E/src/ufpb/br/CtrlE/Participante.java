package ufpb.br.CtrlE;

public class Participante {
	private String nome;
	private String email;
	private String instituicao;
	private Endereco endereco;
	
	public Participante() {
		this.nome = "";
		this.email = "";
		this.instituicao = "";
		this.endereco = new Endereco();
	}
	
	public Participante(String nome,String email, String instituicao,Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.instituicao = instituicao;
		this.endereco = endereco;
	}
	
	public String toString() {
		return "Nome: "+this.nome+" Email: "+this.email+" Instituição: "+this.instituicao+" Endereço: "+this.endereco;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getInstituicao() {
		return this.instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
