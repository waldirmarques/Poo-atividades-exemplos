package br.ufpb.sisbanco;

public class Conta {
	private String cpfTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;
	
	public Conta(){
		this.cpfTitular = "";
		this.numeroAgencia = "";
		this.numeroConta = "";
		this.saldo = 0.0; 	
				
	}
	
	public Conta (String cpf,String numConta, String numAgencia,double numSaldo){
		this.cpfTitular = cpf;
		this.numeroConta = numConta;
		this.numeroAgencia = numAgencia;
		this.saldo = numSaldo;
	}
	public String toString(){
		return "Conta cujo titular tem CPF: "+this.cpfTitular+"\nAgencia: "+this.numeroAgencia
				+"\nNúmero da conta: "+this.numeroConta+"\nCom saldo: "+this.saldo;
	}
	
	public double creditar(double valor){
		this.saldo += valor;
		return saldo;
	}
	
	public double debitar(double valor){
		this.saldo -= valor;
		return saldo;
	}
	
	//metodo usando get e set para cpf titular
	public String getcpfTitular(){
		return this.cpfTitular;
	}
	
	public void setcpfTitular(String cpf){
		this.cpfTitular = cpf;
	}
	// metodos get e set para numero da conta
	public String getnumeroConta(){
		return this.numeroConta;
	}
	public void setnumeroConta(String numConta){
		this.numeroConta = numConta;
	}
	// metodos get set para numero agencia
	public String getnumeroAgencia(){
		return this.numeroAgencia;
	}
	
	public void setnumeroAgencia(String numAgencia){
		this.numeroAgencia = numAgencia;
	}
	
	//metodos get set para saldo
	public double getsaldo(){
		return this.saldo;
	}
	public void setsaldo(double numSaldo){
		this.saldo = numSaldo;
	}
	
	
}
