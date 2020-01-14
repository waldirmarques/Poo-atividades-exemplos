import java.util.Scanner;

public class FusoHorario {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		
		String entrada = input.nextLine();
		String valores [] = entrada.split(" ");
		
		int horas = Integer.parseInt(valores[0]);
		int horasDeViagem = Integer.parseInt(valores[1]);
		int horasDeDeslocamento = Integer.parseInt(valores[2]);
		
		if(horas == 0) {
			horas = 24;
		}
		
		int chegada = horas+horasDeViagem+horasDeDeslocamento;
		
		if(chegada == 24) {
			chegada = 0;
		}else if(chegada > 24) {
			chegada -= 24;
		}
		
		System.out.printf("%d\n",chegada);
		
		input.close();
	}
}
