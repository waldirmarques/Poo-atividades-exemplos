
import java.util.Scanner;

public class TesteDeSelecao1 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner (System.in);
		String entrada[] = leitor.nextLine().split(" ");
		
		
		int A = Integer.parseInt(entrada[0]);
		int B = Integer.parseInt(entrada[1]);
		int C = Integer.parseInt(entrada[2]);
		int D = Integer.parseInt(entrada[3]);
		
		int somaCD = C+D;
		int somaAB = A+B;
		if(((B > C && D > A) && (somaCD > somaAB)) && ((C > 0 && D >0 )&&(A%2 == 0))){
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		leitor.close();
		
	}
}
