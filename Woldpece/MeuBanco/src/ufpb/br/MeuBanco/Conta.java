package ufpb.br.MeuBanco;

public class Conta {
	private String Agencia;
	private String Conta;
	private String CpfTitular;
	private double Saldo;
	
	public Conta() {
		this.Agencia = "";
		this.Conta = "";
		this.CpfTitular = "";
		this.Saldo = 0;
	}
	
	public Conta(String NumeroAgencia,String NumeroConta,String NumCpf,double saldoDinheiro) {
		this.Agencia = NumeroAgencia;
		this.Conta = NumeroConta;
		this.CpfTitular = NumCpf;
		this.Saldo = saldoDinheiro;
	}
	
	public String toString() {
		return "Número Agencia: "+this.Agencia+
			   "\nNúmero da Conta: "+this.Conta+
				"\nNúmero do Cpf: "+this.CpfTitular+
				"\nSaldo da conta: "+this.Saldo;
	}
	
	//Metodo que credita um valor do saldo do cliente
	public double Creditar(double ValorCredito) {
		return this.Saldo += ValorCredito;
	}
	
	//Metodo que Debita um valor do saldo do cliente
	public double Debitar(double ValorDebito) {
		return this.Saldo -= ValorDebito;
	}
	
	
	//Metodo get para o número da agencia do cliente...
	public String getAgencia() {
		return this.Agencia;
	}
	//Metodo set para o número da agencia do cliente...
	public void setAgenica(String NumeroAgencia) {
		this.Agencia = NumeroAgencia;
	}
	
	
	//Metodo get para o número da conta
	public String getConta(){
		return this.Conta;
	}
	//Metodo set para o número da conta
	public void setConta(String NumeroConta) {
		this.Conta = NumeroConta;
	}
	
	
	//Metodo get para o número do cpf
	public String getCpfTitular() {
		return CpfTitular;
	}
	//Metodo set para o número do cpf
	public void setCpfTitular(String NumCpf) {
		this.CpfTitular = NumCpf;
	}
	
	//Metodo get para Saldo
	public double getSaldo() {
		return this.Saldo;
	}
	//Metodo set para Saldo
	public void setSaldo(double valor) {
		this.Saldo = valor;
	}
}
