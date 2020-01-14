package ufpb.br.SisInscrição;

public class Endereco {
	private String Logradouro;
	private String Numero;
	private String Cidade;
	private String Estado;
	
	public Endereco() {
		this.Logradouro = "";
		this.Numero = "";
		this.Cidade = "";
		this.Estado = "";
	}
	
	public Endereco(String LogradoroEndereco,String NumeroEndereco,String CidadeEndereco,String EstadoEndereco) {
		this.Logradouro = LogradoroEndereco;
		this.Numero = NumeroEndereco;
		this.Cidade = CidadeEndereco;
		this.Estado = EstadoEndereco;
	}
	
	public String getLogradouro() {
		return this.Logradouro;
	}
	public void setLogradouro(String novoLogradouro) {
		this.Logradouro = novoLogradouro;
	}
	
	public String getNumero() {
		return this.Numero;
	}
	public void setNumero(String novoNumero) {
		this.Numero = novoNumero;
	}
	
	public String getCidade() {
		return this.Cidade;
	}
	public void setCidade(String novaCidade) {
		this.Cidade = novaCidade;
	}
	
	public String getEstado() {
		return this.Estado;
	}
	public void setEstado(String novoEstado) {
		this.Estado = novoEstado;
	}
	
	public String toString() {
		return "Logradouro: "+this.Logradouro+" Número: "+this.Numero+" Cidade: "+this.Cidade+" Estado; "+this.Estado;
	}
}
