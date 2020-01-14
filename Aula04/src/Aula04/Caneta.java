package Aula04;

public class Caneta {
	private String modelo;
	private double ponta;
	private boolean tampada;
	private boolean destampata;
	
	public Caneta(String modelo, double ponta, boolean tampada, boolean destampata) {
		//super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampada = tampada;
		this.destampata = destampata;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public boolean isDestampata() {
		return destampata;
	}
	public void setDestampata(boolean destampata) {
		this.destampata = destampata;
	}

	public void status() {
		System.out.println("Funcionou");
		
	}
	
	
	
}
