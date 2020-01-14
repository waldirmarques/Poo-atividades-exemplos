import java.util.Scanner;
import java.util.Arrays;

public class Exerc_03 {
	
	public static double CalculaMedia(double [] ListaNotas) {
		double soma = 0;
		for(int k = 0; k<ListaNotas.length;k++) {
			soma+=ListaNotas[k];
		}
		double media = soma/ListaNotas.length;
		return media;
	}
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double notas[] = new double[4];
		
		for(int i = 0; i<notas.length;i++) {
			double notaAlunos = Double.parseDouble(leitor.nextLine());
			notas[i] = notaAlunos;
		}
		double media = CalculaMedia(notas);
		System.out.println("Media das notas: "+media);
		System.out.println(Arrays.toString(notas));
		leitor.close();
		
	}
}
