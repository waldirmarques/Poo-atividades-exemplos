import java.util.Scanner;

public class Exerc_04 {
	
	public static String VerificaPositivoNegativo(int numero) {
		String positivo = "P";
		String negativo = "N";
		if(numero > 0) {
			return positivo;
		}else {
			return negativo;
		}
	}
	
	
	public static void main(String[]arg) {
		Scanner leitor = new Scanner(System.in);
		
		int numero = Integer.parseInt(leitor.nextLine());
		
		String resultado = VerificaPositivoNegativo(numero);
		
		System.out.printf("%s", resultado);
		
		leitor.close();
	}
}
