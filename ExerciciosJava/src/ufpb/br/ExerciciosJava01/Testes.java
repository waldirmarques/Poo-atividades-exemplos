package ufpb.br.ExerciciosJava01;

public class Testes {
	public static void main(String[]args) {
		ContaCorrente cn = new ContaCorrente();
		cn.setSaldo(2000);
		ContaCorrenteEspecial cs = new ContaCorrenteEspecial();
		cs.setSaldo(2000);
		
		cn.sacar(500);
		System.out.println("Valor do saldo do cn: "+cn.getSaldo());
		
		cs.sacar(500);
		System.out.println("Valor do saldo do cs: "+cs.getSaldo());
		cs.depositar(500);
		System.out.println("Valor do saldo com deposito do cs: "+cs.getSaldo());
	}
}
