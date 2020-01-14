package ufpb.br.RevisãoPoliInter;

public class Professor extends Pessoa {
	private double salario;
	
	public Professor(String nome, String cpf, int idade,double salario) {
		super(nome, cpf, idade);
		this.setSalario(salario);
	}
	
	@Override
	public String toString() {
		return "Nome = "+this.getNome()+
				"\nIdade = "+this.getIdade()+
				"\nCPF = "+this.getCpf()+
				"\nSalario = "+this.getSalario();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
