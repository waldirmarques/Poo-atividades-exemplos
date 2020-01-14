package ufpb.br.ExerciciosJava01;

public class ContaCorrenteEspecial extends ContaCorrente {
	private double saldo;
	
	public double sacar(double valor) {
		this.setSaldo(this.saldo - valor);
		double taxa = this.saldo - valor;
		this.setSaldo(this.saldo - (taxa*0.1/100));
		return this.getSaldo();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
