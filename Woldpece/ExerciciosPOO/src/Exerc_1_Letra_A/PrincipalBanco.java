package Exerc_1_Letra_A;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalBanco {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		boolean continuar = true;
		
		while(continuar) {
			Banco meuBanco = new Banco("Linguagem de Programação","123.321.43.533-23", new ArrayList<ContaCorrente>());
			System.out.println("Bem vindo ao "+meuBanco.toString());
			System.out.println("");
			
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("");			
			System.out.println("1 - Abrir Conta: \n2 - Fazer depósito: \n3 - Fazer saque: \n"
					+ "4 - Consultar saldo: \n5 - transferência: \n6 - Consultar extrato: \n7 - Sair: ");			
			
			int entrada = Integer.parseInt(leitor.nextLine());
			
			switch(entrada) {	
				case 1:
					System.out.println("\nInforme os seguintes Dados!");
					System.out.println("");
					String numeroAgencia = Input("Número da agência: ",leitor);
					String numeroConta = Input("\nNúmero da Conta: ",leitor);
					String contaEspecial = Input("\nConta especial S/N: ",leitor);
					String nome = Input("\nNome Completo: ",leitor);
					String cpf = Input("\nNúmero do CPF: ",leitor);
					double valor = InputDouble("\nValor do deposito para abertura da conta: ",leitor);
					
					if(valor <= 0){
						System.out.println("");
						System.out.println("Imposivel abrir conta com esse valor de deposito!");
						break;
					}					
					ContaCorrente ContaCorrente = new ContaCorrente(numeroAgencia,numeroConta,contaEspecial,nome,cpf,valor);
					meuBanco.AbrirConta(numeroAgencia,numeroConta,contaEspecial,nome,cpf,valor);
					
					System.out.println("");
					System.out.println(ContaCorrente.toString());
					System.out.println("Conta aberta com sucesso!");					
					System.out.println("");
					LimpaTela();
					break;
				case 2:
					System.out.println("\nInforme os seguintes Dados!");
					System.out.println("");
					String numeroAgenciaDeposito = Input("Número da agência: ",leitor);
					String numeroContaDeposito = Input("\nNúmero da Conta: ",leitor);
					String contaEspecialDeposito = Input("\nConta especial S/N: ",leitor);
					String nomeDeposito = Input("\nNome Completo: ",leitor);
					String cpfDeposito = Input("\nNúmero do CPF: ",leitor);
					double valorDeposito = InputDouble("\nValor do deposito para abertura da conta: ",leitor);
					
					meuBanco.FazerDeposito(numeroAgenciaDeposito, numeroContaDeposito, contaEspecialDeposito, nomeDeposito, cpfDeposito, valorDeposito);
					System.out.println("");
					System.out.println("Deposito realizado com susseco!");
					break;
				case 3:
					System.out.println("\nInforme os seguintes Dados!");
					System.out.println("");
					String numeroAgenciaSaque = Input("Número da agência: ",leitor);
					String numeroContaSaque = Input("\nNúmero da Conta: ",leitor);
					String contaEspecialSaque = Input("\nConta especial S/N: ",leitor);
					String nomeSaque = Input("\nNome Completo: ",leitor);
					String cpfSaque = Input("\nNúmero do CPF: ",leitor);
					double valorSaque = InputDouble("\nValor do deposito para abertura da conta: ",leitor);
					
					meuBanco.FazerSaque(numeroAgenciaSaque, numeroContaSaque, contaEspecialSaque, nomeSaque, cpfSaque, valorSaque);
					System.out.println("");
					System.out.println("Saque realizado com susseco!");
					break;
				case 4:
					System.out.println("\nInforme os seguintes Dados!");
					System.out.println("");
					String numeroAgenciaSaldo = Input("Número da agência: ",leitor);
					String numeroContaSaldo = Input("\nNúmero da Conta: ",leitor);
					String contaEspecialSaldo = Input("\nConta especial S/N: ",leitor);
					String nomeSaldo = Input("\nNome Completo: ",leitor);
					String cpfSaldo = Input("\nNúmero do CPF: ",leitor);
					
					double saldo = meuBanco.ConsultarSaldo(numeroAgenciaSaldo,numeroContaSaldo,contaEspecialSaldo,nomeSaldo,cpfSaldo);
					
					System.out.println("Saldo da conta: "+saldo);
					break;
					
				case 5:
					System.out.println("\nInforme os seguintes Dados!");
					System.out.println("");
					String numeroAgenciaOrigem = Input("Número da agência: ",leitor);
					String numeroContaOrigem= Input("\nNúmero da Conta: ",leitor);
					String contaEspecialOrigem = Input("\nConta especial S/N: ",leitor);
					String nomeOrigem = Input("\nNome Completo: ",leitor);
					String cpfOrigem = Input("\nNúmero do CPF: ",leitor);
					System.out.println("");
					String numeroAgenciaDestino = Input("Número da agência: ",leitor);
					String numeroContaDestino = Input("\nNúmero da Conta: ",leitor);
					String contaEspecialDestino = Input("\nConta especial S/N: ",leitor);
					String nomeDestino = Input("\nNome Completo: ",leitor);
					String cpfDestino = Input("\nNúmero do CPF: ",leitor);
					System.out.println("");
					System.out.println("Ainda está em desenvolvimento");
					break;
			}
		}
		
	}
	
	public static String Input(String texto, Scanner leitor) {
		System.out.println(texto);
		String entrada = leitor.nextLine();
		return entrada;
	}
	public static Double InputDouble(String texto, Scanner leitor) {
		System.out.println(texto);
		double entrada = Integer.parseInt(leitor.nextLine());
		 return entrada;
	}
	public static void LimpaTela() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
