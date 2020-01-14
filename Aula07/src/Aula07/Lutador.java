package Aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categaria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("=============================\n\nHora da luta...\n");
		System.out.println("Lutador: "+this.getNome()+
							"\nOrigem : "+this.getNacionalidade()+
							"\nIdade : "+this.getIdade()+" anos"+
							"\n"+this.getAltura()+" m de altura"+
							"\nPeso : "+this.getPeso()+" Kg"+
							"\nGanhou : "+this.getVitorias()+
							"\nPerdeu : "+this.getDerrotas()+
							"\nEmpatou : "+this.getEmpates());
	}
	
	public void status() {
		System.out.println("Lutador "+this.getNome());
		System.out.println("Categoria : "+this.getCategaria()+
				"\n"+this.getVitorias()+" Vitórias"+
				"\n"+this.getDerrotas()+" Derrotas");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategaria();
	}
	public String getCategaria() {
		return categaria;
	}
	private void setCategaria() {
		if(this.getPeso() < 52.2) this.categaria = "Inválida";
		else if (this.getPeso() <= 70.3) this.categaria = "Leve";
		else if (this.getPeso() <= 83.9) this.categaria = "Médio";
		else if (this.getPeso() <= 120.2) this.categaria = "Pesado";
		else this.categaria = "Inválido";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}
