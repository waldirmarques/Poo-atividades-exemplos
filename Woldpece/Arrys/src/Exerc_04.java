import java.util.Scanner;

public class Exerc_04 {
	
	public static int ContaConsoantes(String[]caractere, String [] consoantes) {
		int quantidade = 0;
		for(int i = 0; i < caractere.length;i++) { 
			for(int k = 0; k<consoantes.length; k++) {
				if(caractere[i].equals(consoantes[k])) {
					quantidade++;
				}
			}
		}
		return quantidade;
	}
	
	public static String ConsoantesLidas(String[]caractere, String [] consoantes, int quantidade) {
		String Lidas = " ";
		for(int i = 0; i < caractere.length;i++) {
			for(int k = 0; k<consoantes.length; k++) {
				if(caractere[i].equals(consoantes[k])) {
					Lidas+=caractere[i];
				}
			}
		}
		return Lidas;
	}
	
	public static void main(String []args) {
		Scanner leitor = new Scanner(System.in);
		String consoantes [] =  {"a","e","i","o","u"};
		
		String caractere[] = leitor.nextLine().split("");
	
		int QuantidadeDeConsoantes = ContaConsoantes(caractere,consoantes);
		String consoantesIguais = ConsoantesLidas(caractere,consoantes,QuantidadeDeConsoantes);
		
		System.out.println("Quantidade de consoantes lidas: "+QuantidadeDeConsoantes);
		System.out.println("Consoantes iguais; "+consoantesIguais);
		
		leitor.close();
		
			
		
	}
}
