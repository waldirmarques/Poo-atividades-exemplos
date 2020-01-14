package MeuBanco;

import java.util.*;

public class BancoPrincipal {
	public static void main(String[] args) {
		Banco meuBanco = new Banco("Banco de LP", "03.847.655/0001-98", new ArrayList<Conta>());
		System.out.println(meuBanco.toString2());
		System.out.println("Bem vindo ao " + meuBanco.toString());
		Scanner leitor = new Scanner(System.in);
		boolean sair = false;
		while (!sair) {
			System.out.println("");
			System.out.println("Digite uma opção:\n\n1.Abrir conta\n2.Sacar\n3.Depositar\n"+"4.Transferir\n5.Verificar saldo\n6.Sair");
			int opcao = Integer.parseInt(leitor.nextLine());
			switch (opcao) {
			
			case 1: // Abrir conta
				String numConta = input("Digite o número da conta", leitor);
				String numAgencia = input("Digite o número da agência", leitor);
				String cpf = input("Digite o cpf do titular", leitor);
				double saldoInicial = inputComDouble("Qual o depósito inicial?", leitor);
				meuBanco.abrirConta(cpf, numConta, numAgencia, saldoInicial);
				System.out.println("\nConta aberta!");
				break;
			
			case 2: // Sacar
				String numContaSaque = input("Digite o número da conta", leitor);
				String numAgenciaSaque = input("Digite o número da agência", leitor);
				double valorSaque = inputComDouble("Qual o valor a sacar?", leitor);
				double novoSaldo = meuBanco.sacarDeConta(numContaSaque, numAgenciaSaque, valorSaque);
				if (novoSaldo != -1) { // TODO: tratamento de erro temporário
					System.out.println("\nSaque realizado com sucesso. Novo saldo:" + "R$" + novoSaldo);
				} else {
					System.out.println("\nErro");
				}
				break;
			
				// outros cases...
			
			case 3:
				String numeroAgencia = input("Digite o número da agência:", leitor);
				String numeroConta = input("Digite o número da conta:", leitor);
				double saldo = inputComDouble("Qual o valor do depósito?", leitor);
				meuBanco.depositarEmConta(numeroAgencia,numeroConta,saldo);
				System.out.println("\nDeposito feito com sucesso!");
				break;	
			case 4:
				String AgenciaOrigem = input("Digite o número da agência:", leitor);
				String ContaOrigem = input("Digite o número da conta:", leitor);
				String AgenciaDestino = input("Digite o número da agência:", leitor);
				String ContaDestino = input("Digite o número da conta:", leitor);
				double valor = inputComDouble("Qual o valor da tranferencia?", leitor);
				meuBanco.Transferir(AgenciaOrigem, ContaOrigem, AgenciaDestino, ContaDestino, valor);
				break;
			case 5:
				String numAgenciaConsulta = input("Digite o número da agência", leitor);
				String numContaConsulta = input("Digite o número da conta", leitor);
				double valorSaldo = meuBanco.consultarSaldoDeConta(numAgenciaConsulta,numContaConsulta);
				System.out.println("\nO saldo desta conta é de: R$ " + valorSaldo);
				break;			
			case 6:
				sair = true;
				break;
			}
		}
		System.out.println("\nFim do programa");
		leitor.close();
	}

	private static String input(String textoMostrado, Scanner leitor) {
		System.out.println(textoMostrado);
		return leitor.nextLine();
	}

	private static double inputComDouble(String textoMostrado, Scanner leitor) {
		return Double.parseDouble(input(textoMostrado, leitor));
	}
}
