package Aula02;

public class Aula02 {
	public static void main(String[]args) {
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic cristal";
		c1.cor = "Laranga";
		//c1.ponta = 2.9;
		c1.carga = 80;
		c1.tampada = true;
		c1.status();
		c1.rabiscar();
	}
}
