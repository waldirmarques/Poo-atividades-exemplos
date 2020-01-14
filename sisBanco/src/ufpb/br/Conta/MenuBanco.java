package ufpb.br.Conta;
import java.util.*;

public class MenuBanco {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número da Conta: ");
		int numConta = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Informe nome do dono: ");
		String nomeDono = leitor.nextLine();
		
		System.out.println("Informe tipo da conta: ");
		String tipoConta = leitor.nextLine();
		
		ContaBanco conta = new ContaBanco(numConta,nomeDono,tipoConta);
		
		conta.abrirConta(conta.getTipo());
		System.out.println(conta.getSaldo());
		conta.pagarMessalidade(conta.getTipo());
		//conta.depositar(50);
		//conta.sacarDeConta(50);
		//conta.fecharConta();
		System.out.println(conta.toString());
		
		System.out.println("====================================");
		
		leitor.close();
		
	}
}
