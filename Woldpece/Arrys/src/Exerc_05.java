import java.util.Scanner;
import java.util.Arrays;

public class Exerc_05 {
	
	public static String VetorPar(int [] VetorNumeros) {
		String parNumeros = " ";
		for(int i = 0; i<VetorNumeros.length;i++) {
			if(VetorNumeros[i] % 2 == 0) {
				parNumeros += VetorNumeros[i];
				parNumeros += " ";
			}
		}
		return parNumeros;
	}
	
	public static String VetorImpar(int [] VetorNumeros) {
		String imparNumeros = " ";
		for(int i = 0; i<VetorNumeros.length;i++) {
			if(VetorNumeros[i] % 2 != 0) {
				imparNumeros += VetorNumeros[i];
				imparNumeros += " ";
			}
		}
		return imparNumeros;
	}
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int VetorNumeros [] = new int[5];
		
		for(int i = 0; i < VetorNumeros.length;i++) {
			int numero = Integer.parseInt(leitor.nextLine());
			VetorNumeros[i] = numero;
		}
		String Par = VetorPar(VetorNumeros);
		String Impar = VetorImpar(VetorNumeros);
		
		System.out.println("Vetor par: "+Par);
		System.out.println("Vetor impar: "+Impar);
		System.out.println("Vetor completo: "+Arrays.toString(VetorNumeros));
		
		leitor.close();
	}
}
