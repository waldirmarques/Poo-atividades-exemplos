package ufpb.br.test;

public class Calculadora {
	
	public int maior(int a, int b) {
		if(a>b) return a;
		else return b;
	}
	
	public int soma(int a, int b) {
		return a+b;
	}
	
	public int subtracao(int a, int b) {
		return a-b;
	}
	
	public double rais(double valor) {
		return Math.sqrt(valor);
	}
	
	public double media(int total, int pessoas) {
		return total/pessoas;
	}
}
