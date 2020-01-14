package ufpb.br.exercicioJava02;

public class CDs extends CoisasDaLoja implements Discritivel {
	private int numFaixa;
	
	public CDs(String nome, double preco,int numFaixa) {
		super(nome, preco);
		this.numFaixa = numFaixa;
	}
	
	public String toString() {
		return "Nome = "+this.getNome()+" preço = "+this.getPreco()+
				"autor = ";
		
	}
	
	public int getNumFaixa() {
		return numFaixa;
	}
	public void setNumFaixa(int numFaixa) {
		this.numFaixa = numFaixa;
	}

}
