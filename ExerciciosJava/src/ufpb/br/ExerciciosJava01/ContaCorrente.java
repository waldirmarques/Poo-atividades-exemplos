package ufpb.br.ExerciciosJava01;

public class ContaCorrente {
	
	private double saldo;

	public void depositar(double valor) {
		this.setSaldo(this.getSaldo()+ valor);
	}
	
	public double sacar(double valor) {
		this.setSaldo(this.saldo - valor);
		double taxa = this.saldo - valor;
		this.setSaldo(this.saldo - (taxa*0.5/100));
		return this.getSaldo();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
