package Exerc_1_Letra_A;

import java.util.ArrayList;

public class ContaCorrente {
	private String numeroAgencia;
	private String numeroConta;
	private String especialConta;
	private String nome;
	private String cpf;
	private double Saldo;
	private ArrayList <ContaCorrente> Contas = new ArrayList<ContaCorrente>() ;
	
	public ContaCorrente(){
		this.numeroAgencia = "";
		this.numeroConta = "";
		this.especialConta = "";
		this.nome = "";
		this.cpf = "";
		this.Saldo = 0;
		this.Contas = new ArrayList<ContaCorrente>();
	}
	
	public ContaCorrente(String Agencia,String Conta,String ContaEspecial,String nomeUsuario, String cpfUsuario,double valor) {
		this.numeroAgencia = Agencia;
		this.numeroConta = Conta;
		this.especialConta = ContaEspecial;
		this.nome = nomeUsuario;
		this.cpf = cpfUsuario;
		this.Saldo = valor;
	}
	public String toString() {
		return "Número da Agência: "+this.numeroAgencia+
				"\nNúmero da conta: "+this.numeroConta+
				"\nConta especial: "+this.especialConta+
				"\nNome usuario: "+this.nome+
				"\nCpf usuario: "+this.cpf+
				"\nSaldo em conta: "+this.Saldo;
	}
	
	//Método para Creditar dinheiro na Conta.
		public double Creditar(double valor) {
			return this.Saldo + valor;
		}
		
		//Método para Debitar dinheiro da Conta.
		public double Debitar(double valor) {
			return this.Saldo - valor;
		}
		
	public String getnumeroAgencia() {
		return this.numeroAgencia;
	}
	
	public void setnumeroAgencia(String novaAgencia) {
		this.numeroAgencia = novaAgencia;
	}
	
	public String getnumeroConta() {
		return this.numeroConta;
	}
	public void setnumeroConta(String novaConta){
		this.numeroConta = novaConta;
	}
	public String getespecialConta() {
		return this.especialConta;
	}
	public void setespecialConta(String novaEspecialConta){
		this.especialConta = novaEspecialConta;
	}
	public String getnome() {
		return this.nome;
	}
	public void setnome(String novoNome) {
		this.nome = novoNome;
	}
	public String getcpf() {
		return this.cpf;
	}
	public void setcpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	public ArrayList<ContaCorrente> getContas(){
		return this.Contas;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	public void setSaldo(double valor) {
		this.Saldo = valor;
	}
	

}
