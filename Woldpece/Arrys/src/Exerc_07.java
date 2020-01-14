import java.util.Arrays;
import java.util.Scanner;

public class Exerc_07 {
	
	public static int SomaVetor(int []vetor) {
		int soma = 0;
		for(int i = 0;i<vetor.length;i++) {
			soma+=vetor[i];
		}
		return soma;
	}
	
	public static int MultiplicaVetor(int [] vetor) {
		int multiplica = vetor[0];
		for(int i = 1;i<vetor.length;i++) {
			multiplica*=vetor[i];
		}
		return multiplica;
	}
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
	
		int vetor[] = new int[5];
		for(int i=0; i<vetor.length;i++) {
			int numero = Integer.parseInt(leitor.nextLine());
			vetor[i] = numero;
		}
		int soma = SomaVetor(vetor);
		int multiplicacao = MultiplicaVetor(vetor);
		
		System.out.println("Soma dos elementos da lista: "+soma);
		System.out.println("Multiplicação dos elementos da lista: "+multiplicacao);
		System.out.println("Todos os elementos digitados: "+Arrays.toString(vetor));
		
		leitor.close();
	}
}
