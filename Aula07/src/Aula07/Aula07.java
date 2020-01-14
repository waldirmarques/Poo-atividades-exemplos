package Aula07;

public class Aula07 {
	public static void main(String[]args) {
		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Waldir","Brasil",31,1.75,68.9,11,3,1);
		l[1] = new Lutador("Bruno","Italia",29,1.68,57.8,14,2,3);
		
		Luta ufc = new Luta();

		ufc.marcarLuta(l[0],l[1]);
		ufc.lutar();
		System.out.println("\n\n\n\n\n");
		
		l[0].status();
		System.out.println("\n");

		l[1].status();
		
		//l[0].apresentar();
		//l[0].status();
	}
}
