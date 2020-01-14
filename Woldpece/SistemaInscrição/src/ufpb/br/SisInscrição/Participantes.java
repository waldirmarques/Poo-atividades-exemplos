package ufpb.br.SisInscrição;

public class Participantes {
	private String Nome;
	private String Email;
	private String Instituicao;
	private Endereco Endereco;
	
	public Participantes() {
		this.Nome = "";
		this.Email = "";
		this.Instituicao = "";
		this.Endereco = new Endereco();
	}
	
	public Participantes(String nomeParticipante, String emailParticipante,String instituicaoParticipante,Endereco enderecoParticipante) {
		this.Nome = nomeParticipante;
		this.Email = emailParticipante;
		this.Instituicao = instituicaoParticipante;
		this.Endereco = enderecoParticipante;
	}
	
	public String getNome() {
		return this.Nome;
	}
	public void setNome(String novoNome) {
		this.Nome = novoNome;
	}
	
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String novoEmail) {
		this.Email = novoEmail;
	}
	
	public String getInstituicao() {
		return this.Instituicao;
	}
	public void setInstituicao(String novoInstituicao) {
		this.Instituicao = novoInstituicao;
	}
	
	public Endereco getEndereco() {
		return this.Endereco;
	}
	public void setEndereco(Endereco novoEndereco) {
		this.Endereco = novoEndereco;
	}
	
	public String toString() {
		return "Nome: "+this.Nome+"\nEmail: "+this.Email+"\nInstituição: "+this.Instituicao+"\nDados do Endereço: \n"+this.Endereco;
	}
	
}
