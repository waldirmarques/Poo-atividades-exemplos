package ufpb.br.FactoryMethod2;

public class TestePadrao {
	public static void main(String[] args) {
		Pizzaria p1 = new PizzariaRT();
		Pizza p = p1.pedindoPizza("Mussarela");
		System.out.println(p.toString());

	}
}
