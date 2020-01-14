package ufpb.br.Conta;

public class ContaBanco {
	public int numConta;
	private String dono;
	protected String tipo;
	private double saldo;
	private boolean status;
	
	public ContaBanco(int numConta, String dono, String tipo) {
		this.numConta = numConta;
		this.dono = dono;
		this.tipo = tipo;
		this.saldo = 0;
		this.status = false;
	}
	
	public String toString() {
		return "Número da Conta = "+this.getNumConta()+"\nTipo = "+this.getTipo()+"\nDono = "+this.getDono()+"\nSaldo = "+this.getSaldo()
		+ "\nStatus = " + this.getStatus();
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(this.getTipo().equals("CC"))this.setSaldo(50);
		else this.setSaldo(150);			
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0)System.out.println("Conta com dinheiro");
		else if(this.getSaldo() < 0)System.out.println("Você está em debito");
		else this.setStatus(false);
	}
	
	public void sacarDeConta(double valor) {
		if(this.getStatus()){
			if(valor <= this.getSaldo())this.setSaldo(this.getSaldo() - valor);
			else System.out.println("Impossivel fazer saque ");
		}
	}
	
	public void depositar(double valor) {
		if(this.status) System.out.println("Impossivel fazer saque ");
		else this.setSaldo(this.getSaldo()+valor);
	}
	
	public void pagarMessalidade(String tipo) {
		if(this.getTipo().equals("CC")) this.sacarDeConta(12);
		else this.sacarDeConta(15);
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
}
