package ufpb.br.RevisaoClassObjeto;

public class Loja {
	
	private ContaCorrente contaLoja;
	private ContaCorrente contaCliente;
	
	public Loja(ContaCorrente conta, ContaCorrente contaCliente) {
		this.contaLoja = conta;
		this.contaCliente = contaCliente;
	}
	public void vender(double preco) throws Exception {
		this.contaCliente.debitar(preco);
		this.contaLoja.creditar(preco);
	}
}
