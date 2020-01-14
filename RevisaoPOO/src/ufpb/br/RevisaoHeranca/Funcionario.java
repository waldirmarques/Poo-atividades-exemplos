package ufpb.br.RevisaoHeranca;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, int idade, String sexo, double salario) {
		super(nome, idade, sexo);
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return 0.1*this.salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
