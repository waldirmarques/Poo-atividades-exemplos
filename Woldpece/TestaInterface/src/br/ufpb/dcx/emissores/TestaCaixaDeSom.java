package br.ufpb.dcx.emissores;

public class TestaCaixaDeSom {
	public static void main(String[]args) {
		CaixaDeSom caixa = new CaixaDeSom();
		
		Cachorro c1 = new Cachorro("Totó");
		Cachorro c2 = new Cachorro("Bob");
		Cachorro c3 = new Cachorro("Kally");
		
		Tambor t1 = new Tambor("Estrela","P");
		Tambor t2 = new Tambor("Gianinni","G");
		
		caixa.adicionarEmissor(c1);
		caixa.adicionarEmissor(c2);
		caixa.adicionarEmissor(c3);
		caixa.adicionarEmissor(t1);
		caixa.adicionarEmissor(t2);
		
		caixa.tocarTodosOsEmissores();
	}
}
