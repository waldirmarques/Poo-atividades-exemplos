package AulaFabio.ufpb.br;

public class Zoologico {
	public static void main(String[]args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica priguica = new Preguica();
		Passaro passaro = new Passaro();
		Gato gato = new Gato();
		
		Animal jaulas[] = {cachorro,cavalo,priguica,passaro,gato};
		
		for(int k = 0;k<jaulas.length;k++) {
			System.out.println("cutucada...");
			jaulas[k].emetirSom();
			System.out.println("\n");
		}
		
	}
}
