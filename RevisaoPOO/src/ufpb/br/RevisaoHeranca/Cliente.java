package ufpb.br.RevisaoHeranca;

public class Cliente extends Pessoa{
	private double saldo;
	private double chequeEspecial;
	private double limite;
	
	public Cliente(String nome, int idade, String sexo,double saldo,double chequeEspecial,double limite) {
		super(nome, idade, sexo);
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.limite = limite;
	}
	
	public double sacar(double valor) {
		if(valor < 0 || valor > this.saldo+this.chequeEspecial) return -1;
		else return this.saldo-=valor;
	}
	
	public void depositar(double valor) {
		if(valor < 0 || valor > this.limite) System.out.println("Imposivel depositar mais que o limite permite");
		else this.saldo+=valor;
	}
	
}
