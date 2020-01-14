import java.util.Arrays;
import java.util.Scanner;

public class Exerc_02 {
	
	public static int [] ListaInvertida(int [] entrada) {
		int [] Invertido = new int[entrada.length];
		int k = 0;
		
		for(int i = (Invertido.length - 1); i >= 0;i--) {
			Invertido[i] = entrada[k];
			k++;			
		}		
		return Invertido;
	}
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int VetorNumeros [] = new int[10];
		
		for(int i = 0; i < VetorNumeros.length;i++) {
			int entrada = Integer.parseInt(leitor.nextLine());
			VetorNumeros[i]=entrada;
		}
		
		int resultado [] = ListaInvertida(VetorNumeros);
		System.out.println(Arrays.toString(resultado));
		
		leitor.close();
	}
}
