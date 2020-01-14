package ufpb.br.MeuBanco;

import javax.swing.JOptionPane;

public class MeuBanco {
	public static void main(String[]args) {
		Conta MinhaConta = new Conta();
		
		String Agencia = JOptionPane.showInputDialog("Informe o numero da sua Agencia: ");
		String Conta = JOptionPane.showInputDialog("Informe número da sua conta: ");
		String Cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
		double Saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe saldo: "));
		
		Conta c = new Conta(Agencia,Conta,Cpf,Saldo);
		System.out.println(c);
		
	}

}
