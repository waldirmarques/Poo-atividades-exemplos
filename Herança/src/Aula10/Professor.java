package Aula10;

public class Professor extends Pessoa {
	
	private String especialidade;
	private double salario;
	
	public void receberAum(double aumento) {
		this.setSalario(this.salario+aumento);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
