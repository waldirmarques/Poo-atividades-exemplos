import java.util.Scanner;

public class ConversaoDeTempo {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		int entradaHora = Integer.parseInt(leitor.nextLine());
		
		int hora = entradaHora / 3600;
		int restoHora = entradaHora % 3600;
		
		int menuto = restoHora / 60;
		int restoMinuto = restoHora % 60;
		
		
		System.out.println(hora+":"+menuto+":"+restoMinuto);
		
		leitor.close();
	}
}
