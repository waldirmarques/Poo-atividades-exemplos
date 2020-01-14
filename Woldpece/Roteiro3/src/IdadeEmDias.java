import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int anosEmDias = Integer.parseInt(input.nextLine());
		
		int anos = anosEmDias / 365;
		int resAnos = anosEmDias%365;
		
		int meses = resAnos/30;
		int resMeses = resAnos%30;		
		
		System.out.printf("%d ano(s)\n",anos);
		System.out.printf("%d mes(es)\n",meses);
		System.out.printf("%d dia(s)\n",resMeses);
		
		input.close();
	}
}
