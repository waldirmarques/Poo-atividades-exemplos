package ufpb.br.RevisaoInterface;

public class Diretor extends Funcionario implements Autenticavel{
	
	private int senha;
	public Diretor(String nome, int idade, String sexo, double salario,int senha) {
		super(nome, idade, sexo, salario);
		this.senha = senha;
	}
	@Override
	public boolean autentica(int senha) {
		return senha == this.senha;
	}
	
}
