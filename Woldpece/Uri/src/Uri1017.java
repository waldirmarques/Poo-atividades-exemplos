import java.util.Scanner;

public class Uri1017 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		 float  tempoGasto = Float.parseFloat(leitor.nextLine());
		 float velocidadeMedia = Float.parseFloat(leitor.nextLine());
		 
		 float distancia = velocidadeMedia*tempoGasto;
		 
		 float resposta = distancia/12;
		 
		 System.out.printf("%.3f",resposta);
		 
		 leitor.close();
	}
}
