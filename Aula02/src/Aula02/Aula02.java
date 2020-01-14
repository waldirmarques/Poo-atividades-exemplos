package Aula02;

public class Aula02 {
	public static void main(String[]args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "vermelho";
		c1.modelo = "Compact";
		c1.ponta = 0.5;
		c1.carga = 90;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		System.out.println("\n\n\n");

		Caneta c2 = new Caneta();
		c2.carga = 100;
		c2.cor = "Azul";
		c2.modelo = "007";
		c2.ponta = 1.0;
		c2.destampar();
		c2.rabiscar();
		c2.status();
	}
}
