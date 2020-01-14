package ufpb.br.RevisaoClassObjeto;

public class Menu {

	public static void main(String[] args) {
		ContaCorrente contaCliente = new ContaCorrente(100,100);
		ContaCorrente contaLoja = new ContaCorrente(1000,100);
		Loja loja = new Loja(contaLoja,contaCliente);
		try{
			loja.vender(100);
			loja.vender(150);
			loja.vender(0);
			loja.vender(-10);
			System.out.println("teste saldo cliente = "+contaCliente.getSaldo());
			System.out.println("teste saldo loja = "+contaLoja.getSaldo());
		
		}catch (Exception ex) {
			System.out.println("Erro: "+ex.toString());
		}
	}

}
