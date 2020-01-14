import java.util.Scanner;

public class Exerc_01 {
	public static String mostraLista(int []lista) {
		String saida = "";
		for(int i = 0;i<lista.length;i++) {
			saida += lista[i];
			saida += " ";
		}
		return saida;
	}
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int quantidade = 5;
		int VetorInt [] = new int[quantidade];
		for(int i = 0;i<VetorInt.length;i++) {
			int entrada = Integer.parseInt(leitor.nextLine());
			VetorInt[i]=entrada;
		}
		System.out.println();
		String resultado = mostraLista(VetorInt);
		System.out.println(resultado);
		leitor.close();
	}
}
