import java.util.Scanner;

public class programaDespesa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Programa de despesas. Quantas despesas? ");
		int numDespesas = Integer.parseInt(leitor.nextLine());
		Despesa [] despesas = new Despesa[numDespesas];
		for(int k=0;k<despesas.length;k++) {
			System.out.println(k);
		}
		
	leitor.close();
	}
	

}
