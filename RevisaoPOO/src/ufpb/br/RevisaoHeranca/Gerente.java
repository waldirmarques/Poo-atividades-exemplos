package ufpb.br.RevisaoHeranca;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeGerenciados;
	
	public Gerente(String nome, int idade, String sexo, double salario,int senha, int numeroDeGerenciados) {
		super(nome, idade, sexo, salario);
		this.senha = senha;
		this.numeroDeGerenciados = numeroDeGerenciados;
	}
	
	@Override
	public double getBonificacao(){
		return 0.2*this.getSalario();
	}
	
	public boolean autentica(int senha) {
		return (senha == this.senha);	
	}
	public boolean autentica(byte[] senha) {
		for(byte i : senha) {
			return true;
		}
		return false;
	}
}
