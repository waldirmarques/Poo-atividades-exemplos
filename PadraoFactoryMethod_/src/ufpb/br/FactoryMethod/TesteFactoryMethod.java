package ufpb.br.FactoryMethod;

public class TesteFactoryMethod {

	public static void main(String[] args) {
		FactoryPessoa f = new FactoryPessoa();
		String nome = "Waldir";
		String sexo = "M";
		
		System.out.println(f.getPessoa(nome, sexo));
		
		

	}

}
