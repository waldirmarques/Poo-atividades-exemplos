package Aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("Tampada: "+this.tampada);

	}
	public void escrever() {
		if(this.tampada == true || this.carga <= 0) System.out.println("Não pode escrever");
		System.out.println("Estou escrevendo");
	}
	
	public void rabiscar() {
		if(this.tampada == true || this.carga <= 0) {
			System.out.println("Impossivel rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void pintar() {
		System.out.println("Estou pintando");
	}
	
	@SuppressWarnings("unused")
	private void tampar() {
		this.tampada = true;
	}
	@SuppressWarnings("unused")
	private void destampar() {
		this.tampada = false;
	}
}
