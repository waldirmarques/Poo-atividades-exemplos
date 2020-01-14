package Exerc_1_Letra_A;

import java.util.ArrayList;

public class Banco {
	
	private String nomeBanco;
	private String cnpjBanco;
	private ArrayList<ContaCorrente> Contas;
	
	public Banco(){
		this.nomeBanco = "";
		this.cnpjBanco = "";
		this.Contas = new ArrayList<ContaCorrente>();
	}
	
	public Banco(String novoNomeBanco, String novoCnpjBanco,ArrayList<ContaCorrente> Contas) {
		this.nomeBanco = novoNomeBanco;
		this.cnpjBanco = novoCnpjBanco;
		this.Contas = Contas;
	}
	public String toString() {
		return "Banco: "+this.nomeBanco+"  Cnpj: "+this.cnpjBanco+" Quantidade de contas: "+this.Contas.size();
	}
	
	//Método para abrir conta e por em uma lista para consultar depois.
	public void AbrirConta(String Agencia,String Conta,String ContaEspecial,String nomeUsuario, String cpfUsuario,double valor) {
		ContaCorrente Contas = new ContaCorrente(Agencia,Conta,ContaEspecial,nomeUsuario,cpfUsuario, valor);
		this.Contas.add(Contas);
	}
	
	//Método para consultar o saldo em que o usuario tem em conta.

	public double ConsultarSaldo(String Agencia,String Conta,String ContaEspecial,String nomeUsuario, String cpfUsuario) {
		for(ContaCorrente contas: this.Contas) {
			if(contas.getnumeroAgencia().equals(Agencia) && contas.getnumeroConta().equals(Conta) && contas.getespecialConta().equals(ContaEspecial) &&
					contas.getnome().equals(nomeUsuario) && contas.getcpf().equals(cpfUsuario)){
				
				return contas.getSaldo();
			}
		}
		return -1;
	}
	//Método para fazer um deposito em uma conta.
	public void FazerDeposito(String Agencia,String Conta,String ContaEspecial,String nomeUsuario, String cpfUsuario,double valor) {
		for(ContaCorrente contas: this.Contas) {
			if(contas.getnumeroAgencia().equals(Agencia)&&contas.getnumeroConta().equals(Conta)&&contas.getespecialConta().equals(ContaEspecial)&&
					contas.getnome().equals(nomeUsuario)&&contas.getcpf().equals(cpfUsuario)) {
				contas.Creditar(valor);
			}
		}
	}
	//Método para fazer saque de uma conta
	public void FazerSaque(String Agencia,String Conta,String ContaEspecial,String nomeUsuario, String cpfUsuario,double valor) {
		for(ContaCorrente contas: this.Contas) {
			if(contas.getnumeroAgencia().equals(Agencia)&&contas.getnumeroConta().equals(Conta)&&contas.getespecialConta().equals(ContaEspecial)&&
					contas.getnome().equals(nomeUsuario)&&contas.getcpf().equals(cpfUsuario)) {
				contas.Debitar(valor);
			}
		}
	}
	
	public String getnomeBanco() {
		return this.nomeBanco;
	}
	public void setnomeBanco(String novoNomeBanco) {
		this.nomeBanco = novoNomeBanco;
	}
	public String getcnpjBanco() {
		return this.cnpjBanco;
	}
	public void setcnpj(String novoCnpjBanco) {
		this.cnpjBanco = novoCnpjBanco;
	}
	public ArrayList<ContaCorrente> getcontas(){
		return this.Contas;
	}
	public void setcontas(ArrayList<ContaCorrente> novaConta){
		this.Contas = novaConta;
	}
	
	
}
