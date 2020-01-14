import java.util.Scanner;

public class Exerc_06 {
	
	private static Scanner leitor;

	public static double SomaNotas() {
		leitor = new Scanner(System.in);
		
		double nota1 = Double.parseDouble(leitor.nextLine());
		double nota2 = Double.parseDouble(leitor.nextLine());
		double nota3 = Double.parseDouble(leitor.nextLine());
		double nota4 = Double.parseDouble(leitor.nextLine());
		
		double soma = nota1+nota2+nota3+nota4;
		return soma;
	}
	
	public static int ProcuraQuantidadeComNotaAcimaDeSete(double [] mediaVetor) {
		int quantidade = 0;
		for(int i = 0;i<mediaVetor.length;i++) {
			if(mediaVetor[i] >= 7.0) {
				quantidade ++;
			}
		}
		return quantidade;
	}
	
	public static void main(String[]args) {
		double mediaVetor [] = new double[2];
		
		for(int i = 0; i <mediaVetor.length;i++) {
			System.out.println("Informe as quatro notas do "+(i+1)+"º alunos");
			double soma = SomaNotas();
			mediaVetor[i] = soma/4;
		}
		int quantidadeMaiorSete = ProcuraQuantidadeComNotaAcimaDeSete(mediaVetor);
		System.out.println("Alunos com nota a cima de 7.0: "+quantidadeMaiorSete);
	}
}
