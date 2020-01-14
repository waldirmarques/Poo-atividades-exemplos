package Aula02;

public class Caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	public void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("Tampada: "+this.tampada);

	}
	
	public void rabiscar() {
		if(this.tampada == true || this.carga <= 0) {
			System.out.println("Impossivel rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
}
