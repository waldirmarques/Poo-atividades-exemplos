package ufpb.br.RevisaoClassObjeto;

public class ContaCorrente {
	private double saldo;
	private double chequeEspecial;
	
	public ContaCorrente(double saldo, double chequeEspecial) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
	}
	public void creditar(double valor) throws Exception {
		if(valor < 0) throw new Exception("Não pode creditar valor negativo");
		else this.setSaldo(this.getSaldo()+valor);
	}	
	public void debitar(double valor) throws Exception{
		if(valor < 0) throw new Exception("Não pode debitar valor negativo");
		else if(valor > this.getSaldo()+this.getChequeEspecial()) throw new Exception("Valor acima do limite permitido");
		else if(valor > 0 && valor <= this.getSaldo()) this.setSaldo(this.getSaldo() - valor);
		else this.setSaldo(this.getSaldo() + (this.getChequeEspecial() - valor));
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**private int numeroConta;
	private String cliente;
	private double limite;
	
	public ContaCorrente(double saldo, int numeroConta, String cliente, double limite) {
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	*/
	
}
