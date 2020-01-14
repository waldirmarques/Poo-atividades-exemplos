package ufpb.br.MeuBanco;

//import java.util.ArrayList;

public class Banco {
	private String NomeBanco;
	private String Cnpj;
	private ArrayList <Conta> contas;
	
	public Banco() {
		this.NomeBanco = "";
		this.Cnpj= "";
		this.contas = new ArrayList<conta>();
		this.numContas = 0;
	}
	
	public Banco (String NomeDoBanco,String NomeDoCnpj,double QuantidadeDeConta) {
		this.NomeBanco = NomeDoBanco;
		this.Cnpj = NomeDoCnpj;
		this.setConta (ArrayContas);
	}
	
	public String toString() {
		return "Banco: "+this.NomeBanco+"\nCNPJ: "+this.Cnpj+"Numero de Contas: "+this.numContas;
	}
	//Metodo que Abre uma conta no banco...
	public void AbrirUmaConta(String NumAgencia, String NumConta, String NumCpf, double Valor) {
		Conta NovaConta = new Conta(NumAgencia,NumConta,NumCpf,Valor);
		this.ArrayContas[numContas] = NovaConta;
		numContas++;
	}
	
	public double SacarDeUmaConta(String NumAgencia,String NumConta,double Valor) {
		for(int k = 0; k<this.numContas;k++) {
			if(this.ArrayContas[k].getAgencia().equals(NumAgencia) && this.ArrayContas[k].getConta().equals(NumConta)) {
				return this.ArrayContas[k].Debitar(Valor);
			}
		}
		return -1;
	}
	
	public double DepositarEmUmaConta(String NumAgencia,String NumConta,double Valor) {
		for(int k = 0; k<this.numContas;k++) {
			if(this.ArrayContas[k].getAgencia().equals(NumAgencia) && this.ArrayContas[k].getConta().equals(NumConta)) {
				return this.ArrayContas[k].Creditar(Valor);
			}
		}
		return -1;
	}
	
	public void TransferirDeConta (String AgenciaDeOrigem,String ContaDeOrigem,String AgenciaDestino,String ContaDestino,double Valor) {
		SacarDeUmaConta(AgenciaDeOrigem,ContaDeOrigem,Valor);
		DepositarEmUmaConta(AgenciaDestino,ContaDestino,Valor);
	}
	
	public double ConsultarSaldo(String NumAgencia,String NumConta) {
		for(int k = 0; k<this.numContas;k++) {
			if(this.ArrayContas[k].getAgencia().equals(NumAgencia)&&this.ArrayContas[k].getConta().equals(NumConta)) {
				return this.ArrayContas[k].getSaldo();
			}
		}
		return -1;
	}
	
	//Metodo get para o nome do banco
	public String getNomeBanco() {
		return this.NomeBanco;
	}
	//Metodo set para o nome do banco
	public void setNomeBanco(String NomeNovoBanco) {
		this.NomeBanco = NomeNovoBanco;
	}
	//Metodo get para o Cnpj do banco
	public String getCnpj() {
		return this.Cnpj;
	}
	//Metodo set para o Cnpj do banco
	public void setCnpj(String NomeNovoCnpj) {
		this.Cnpj = NomeNovoCnpj;
	}
	
	//Encontra uma maneira de retornar a função com o metodo implementado com uma lista
	
	//Metodo get Conta
	public Conta[] getConta() {
		return this.ArrayContas;
	}
	//Metodo set da lista de Conta, o for roda buscanco os espaços vazios que tem na lista
	//Quando encontra sai do for, enquanto almenta um na quantidade de contas do banco.
	public void setConta(Conta[] ListaConta) {
		this.ArrayContas = ListaConta;
		this.MaxContas = this.ArrayContas.length;
		this.numContas = 0;
		for(int k = 0; k < MaxContas;k++) {
			if(this.ArrayContas == null) {
				break;
			}else {
				this.numContas ++;
			}
		}
	}
}