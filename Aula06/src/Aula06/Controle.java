package Aula06;

public class Controle {
	public static void main(String[]args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.ligarMudo();
		//c.desligar();
		c.abrirMenu();
	}
}
