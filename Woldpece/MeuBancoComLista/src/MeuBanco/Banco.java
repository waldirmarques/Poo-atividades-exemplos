package MeuBanco;

import java.util.ArrayList;

public class Banco {
	private String nome;
	private String cnpj;
	private ArrayList <Conta> contas;

	public Banco() {
		this.nome = "";
		this.cnpj = "";
		this.contas = new ArrayList<Conta>();
	}

	public Banco(String nome, String cnpj, ArrayList<Conta> contas) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.setConta(contas);
	}
	public String toString2() {
		return "###################################### SISTEMA BANCO ##########################################\n";
	}
	
	public String toString() {
		return "Banco: "+this.nome+"\nCnpj: "+this.cnpj+"\nQuantidade de contas: "+this.contas.size();
	}

	public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
		Conta c = new Conta(cpfTitular, numConta, numAgencia, saldoInicial);
		this.contas.add(c);
		// TODO: Lembrar de checar limite máximo e se conta existe
	}

	public double sacarDeConta(String numConta, String numAgencia, double valor) {
		for (Conta c: this.contas) {
			if (c.getNumeroConta().equals(numConta)&& c.getNumeroAgencia().equals(numAgencia)) {
				return c.debitar(valor);
			}
		}
		// TODO: tratar erro
		return -1;
	}

	public double depositarEmConta(String numConta, String numAgencia, double valor) {
		for (Conta c: this.contas) {
			if (c.getNumeroConta().equals(numConta)&& c.getNumeroAgencia().equals(numAgencia)) {
				return c.creditar(valor);
			}
		}
		// TODO: tratar erro
		return -1;
	}
	
	public double consultarSaldoDeConta(String numAgencia,String numConta) {
		for(Conta c: this.contas) {
			if(c.getNumeroAgencia().equals(numAgencia)&&c.getNumeroConta().equals(numConta)) {
				return c.getSaldo();
			}
		}
		return -1;
	}
	
	public void Transferir(String AgenciaOrigem,String ContaOrigem,String AgenciaDestino,String ContaDestino,double valor) {
		sacarDeConta(AgenciaOrigem,ContaOrigem,valor);
		depositarEmConta(AgenciaDestino,ContaDestino,valor);
	}

	public ArrayList<Conta> getConta() {
		return this.contas;
	}
	
	public void setConta(ArrayList<Conta> Novascontas) {
		this.contas = Novascontas;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
