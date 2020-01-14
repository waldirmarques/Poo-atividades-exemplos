package br.ufpb.sisbanco;

public class Banco {
	private String nome;
	private String cnpj;
	private Conta [] contas;
	private int maxContas;
	private int numContas;

	public Banco(){
		this.nome = "";
		this.cnpj = "";
		int maxContas = 1000;
		this.contas = new Conta[maxContas];
		this.numContas = 0;
	}
	
	public Banco(String nome,String cnpj,Conta[] contas){
		this.nome = nome;
		this.cnpj = cnpj;
		this.setContas(contas);
		
	}
	// metodo para abrir uma conta
	public void abrirConta(String cpfTitular, String numConta,String numeroAgencia, double saldo) {
		Conta novaConta = new Conta(cpfTitular,numConta,numeroAgencia,saldo);
		this.contas[numContas] = novaConta;
		numContas++;
		//Todo: Lembrar de checar limite máximo e se conta existe
	}
	// metodo para sacar de uma conta
	public double sacarDeConta(String numConta,String numeroAgencia, double valor) {
		for(int k = 0; k < this.numContas;k++) {
			if(this.contas[k].getnumeroConta().equals(numConta) &&
					this.contas[k].getnumeroAgencia().equals(numeroAgencia)) {
				return this.contas[k].debitar(valor);
			}
		}
		return -1.0;
	}
	
	// verifica se tem valores na lista de contas ou se esta vazio
	public void setContas(Conta[] contas){
		this.contas = contas;
		this.maxContas = this.contas.length;
		this.numContas = 0;
		for(int k = 0;k < maxContas; k++) {
			if(this.contas[k] == null) {
				break;
			}else {
				this.numContas++;
			}
		}
	}
	// metodo que deposita em outra conta
	public double DepositarEmUmaConta(String numeroConta, String numeroAgencia, double valor) {
		for(int k = 0; k < this.numContas;k++) {
			if(this.contas[k].getnumeroConta().equals(numeroConta) && 
					this.contas[k].getnumeroAgencia().equals(numeroAgencia)) {
				return this.contas[k].creditar(valor);
			}
		}
		return -1.0;
	}
	
	// metodo para consultar o saldo do banco
	public double consultarSaldoDeConta(String numeroAgencia, String numeroConta) {
		for(int k = 0; k < this.numContas; k++) {
			if(this.contas[k].getnumeroConta().equals(numeroConta) &&
					this.contas[k].getnumeroAgencia().equals(numeroAgencia)) {
				return this.contas[k].getsaldo();
			}
		}
		return -1;
	}
	
	// metodo toString
	public String toString(){
		return "Banco: "+this.nome+"\nCnpj: "+this.cnpj+"\nPossui contas: "+numContas;
	}
	
	//metodo transferir de uma conta para outra
	public void transferir(String numeroConta,String numeroAgencia,String numContaDestino,String numAgenciaDestino, double valor) {
		//this.sacarDeConta(numConta, numeroAgencia, valor);
		for(int k = 0; k < numContas; k++) {
			if(this.contas[k].getnumeroAgencia().equals(numeroAgencia)&&
					this.contas[k].getnumeroConta().equals(numeroConta)){
				this.contas[k].debitar(valor);
			}			
		}
		//this.DepositarEmUmaConta(numeroConta, numeroAgencia, valor);
		for(int k = 0; k < this.numContas;k++) {
			if(this.contas[k].getnumeroConta().equals(numContaDestino) &&
					this.contas[k].getnumeroAgencia().equals(numAgenciaDestino)) {
				this.contas[k].creditar(valor);
			}
		}
	}
	
	//get e set para nome
	public String getnome () {
		return this.nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	//get e set para cnpj
	public String getcnpj() {
		return this.cnpj;
	}
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	// metodos get e set para contas lista
	public Conta[] getContas(){
		return this.contas;
	}

}

