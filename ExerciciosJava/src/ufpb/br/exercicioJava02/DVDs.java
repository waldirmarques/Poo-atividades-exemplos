package ufpb.br.exercicioJava02;

public class DVDs extends CoisasDaLoja implements Discritivel {
	private int duracao;
	
	public DVDs(String nome, double preco,int duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}
	
	
	
	public int getNumFaixa() {
		return duracao;
	}
	public void setNumFaixa(int numFaixa) {
		this.duracao = numFaixa;
	}
}
