import java.util.Scanner;

public class Excer_02 {
	public static String InverteNomes(String [] nome) {
		String nomeInvertido = "";
		for(int i = (nome.length)-1;i >= 0;i--) {
			nomeInvertido += "\n";			
			nomeInvertido += nome[i];
			
		}
		nomeInvertido.toString().toUpperCase();
		return nomeInvertido;
	}
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		String nome [] = leitor.nextLine().split(" ");
		String resposta = InverteNomes(nome);
		System.out.println("Nome invertido: "+resposta);
		
		leitor.close();
	}
}
