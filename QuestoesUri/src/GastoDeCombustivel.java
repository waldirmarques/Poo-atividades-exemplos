import java.util.Scanner;

public class GastoDeCombustivel {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double performasse = 12;
		int tempoViagem = Integer.parseInt(leitor.nextLine());
		int velocidadeMedia = Integer.parseInt(leitor.nextLine());
		
		double tempoGasto = (tempoViagem * velocidadeMedia) / performasse;
		
		System.out.println(String.format("%.3f", tempoGasto));
		
		leitor.close();
	}
}
