import java.util.Scanner;
public class SubistituiElementos {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);	
		int valores [] = new int [10];
		
		for(int i = 0; i < valores.length;i++) {
			int numero = Integer.parseInt(input.nextLine());
			if(numero <= 0) {
				valores[i] = 1;
			}else {
				valores[i] = numero;
			}
			System.out.printf("X[%d] = %d\n",i,valores[i]);
		}
		input.close();
	}
}
