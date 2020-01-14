package ufpb.br.RevisãoPoliInter;

public class Aluno extends Pessoa {
	private String matricula;	
	
	public Aluno(String nome, String cpf, int idade,String matricula) {
		super(nome, cpf, idade);
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Nome = "+this.getNome()+
				"\nIdade = "+this.getIdade()+
				"\nCPF = "+this.getCpf()+
				"\nMatricula = "+this.getMatricula();
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
