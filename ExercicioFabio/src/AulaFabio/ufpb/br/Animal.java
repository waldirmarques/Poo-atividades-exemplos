package AulaFabio.ufpb.br;

public abstract class Animal {
	private String nome;
	private int idade;
	
	@Override
	public String toString() {
		return "Animal nome = " + nome + ", idade = " + idade;
	}

	public abstract void emetirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
