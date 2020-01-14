import java.util.Scanner;
import javax.swing.JOptionPane;

public class JogoDaForca {
	
	public static void main(String[]args) {	
		Scanner leitor = new Scanner(System.in);		
		String Entrada = JOptionPane.showInputDialog("Informe palavra para ser adivinhada: ");		
		String DicaEntrada = JOptionPane.showInputDialog("Informe uma dica: ");
		
		char palavra [] = new char[Entrada.length()];		
		for(int i = 0; i < palavra.length;i++) {
			palavra[i] = '-';
		}
		
		int tentativas = 6;
		int cont = 0;

		while(cont < tentativas) {	
			System.out.println("________________________________________________________________");
			System.out.println("\t\tTentativas restantes: "+(tentativas-cont));
			System.out.println("\nInforme qual palavra você acha que é: ");
			System.out.println("Dicas: "+DicaEntrada+" e tem "+Entrada.length()+" letras");
			
			String palavraEntrada = leitor.nextLine();			
			if(palavraEntrada.equals(Entrada)) {
				
				System.out.println("Você acabou de acertar a palavra, parabéns!!!");
				break;
				
			}else {				
				System.out.println("\nInfelizmente vc errou! ");
				System.out.println("\nDigite uma letra: ");
				char chute = leitor.nextLine().charAt(0);
				
				for(int i = 0; i < palavra.length;i++) {				
					if(Entrada.charAt(i) == chute) {
						System.out.println("\nParabéns, vc acertou uma letra!");
						palavra[i] = chute;
						System.out.println(palavra);
						System.out.println();
					}				
				}
			
			}	
			cont++;
		}
		
		System.out.println("Infelizmente vc perdeu!!");
		System.out.println("Fim de jogo!!");
		leitor.close();
	}
}