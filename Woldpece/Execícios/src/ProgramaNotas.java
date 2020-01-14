import java.util.Scanner;

public class ProgramaNotas {
	//Primeiro metodo
	public static double calculaMaiorNota(double [] notas) {
		double maiorNota = notas[0];		
		for(int i = 1; i < notas.length; i++) {
			if(notas[i] >= maiorNota) {
				maiorNota = notas[i];
			}
		}
		return maiorNota;
	}
	//Segundo metodo
	public static int contaAlunosComNome(String [] nomes, String nomeAPesquisar) {
		int quantidadeNomes = 0;
		
		
		for(int i = 0; i < nomes.length; i++) {
			if(nomes[i].startsWith(nomeAPesquisar)) {
				quantidadeNomes++;
			}
		}
		
		return quantidadeNomes;
	}
	//Terceiro metodo	
	public static int contaAlunosComNotaBaixa(double[] notas) {
		int totalNotasBaixas = 0;
		
		for (int k = 0; k < notas.length; k++) {
			if (notas[k] < 7.0) {
				totalNotasBaixas++;
				
			}
			
		}
		return totalNotasBaixas;
	}
	//Quarto metodo
	public static String[] imprimeNomesQueComecamCom(String[] nomes, String nomeAPesquisar) {
		String[] imprimeNomes = new String[nomes.length];
		
		for (int k = 0; k < nomes.length; k++) {
			if (nomes[k].startsWith(nomeAPesquisar)) {
				imprimeNomes[k] = nomeAPesquisar;
				
			}
		}
		return imprimeNomes;
	}
	//Metodo principal...	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CALCULANDO NOTAS DA TURMA");
		System.out.print("Quantos alunos h� na turma ? ");
		int numeroAlunos = Integer.parseInt(input.nextLine());
		
		String[] listaNomes = new String[numeroAlunos];
		double[] listaNotas = new double[numeroAlunos];
		
		for (int k = 0; k < numeroAlunos; k++) {
			System.out.print("Qual o nome do aluno " + (k+1) + " ? ");
			listaNomes[k] = input.nextLine();
			
			System.out.print("Qual a nota do aluno " + (k+1) + " ? ");
			listaNotas[k] = Double.parseDouble(input.nextLine());
			System.out.println();
			
			
		}
		if (numeroAlunos > 0) {
			System.out.println("A maior nota da turma foi: " + calculaMaiorNota(listaNotas));
			System.out.print("Qual o nome a pesquisar ? ");
			String nomeAPesquisar = input.nextLine();
			
			int quantidadeNomes = contaAlunosComNome(listaNomes, nomeAPesquisar);
			System.out.println("A quantidade de alunos com o nome " + nomeAPesquisar + " �: "
					+ quantidadeNomes);
			
		}
		System.out.println("Fim do programa");
		input.close();
	}
}
