import java.util.Scanner;

public class Ordenacao {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in); {
			
		int elementos = Integer.parseInt(input.nextLine());
		int VetorNumeros [] = new int[elementos];
		int menorNumero = 0;
		int indice = 0;
			
		String entradaValores = input.nextLine();			
		String vetorString [] = entradaValores.split(" ");
			
		for(int i = 0;i<VetorNumeros.length;i++) {
			int num = Integer.parseInt(vetorString[i]);				
				VetorNumeros[i] = num;
		}
		for(int k = 0;k<VetorNumeros.length;k++) {
			if(VetorNumeros[k] <= menorNumero) {
				menorNumero = VetorNumeros[k];
				indice = k;
			}
		}
		System.out.printf("Menor valor: %d\n", menorNumero);
		System.out.printf("Posicao: %d\n", indice);
		
	input.close();
		}
	}
}
