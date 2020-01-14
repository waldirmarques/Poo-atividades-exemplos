import java.util.Scanner;

public class FormulaDeBhaskara {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		String entrada[] = leitor.nextLine().split(" ");
		
		double valor1 = Double.parseDouble(entrada[0]);
		double valor2 = Double.parseDouble(entrada[1]);
		double valor3 = Double.parseDouble(entrada[2]);
		
		double result= Math.pow(valor2, 2);
		double delta = result - (4 * valor1 * valor3);
		double raizQuadrada = Math.sqrt(delta);
		
		double raiz1 = (-valor2 + raizQuadrada)/(2*valor1);
		double raiz2 = (-valor2 - raizQuadrada)/(2*valor1);
		
		if(2*valor1 == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}else{
			System.out.println(String.format("R1 = %.5f",raiz1));
			System.out.println(String.format("R2 = %.5f",raiz2));	
		}
		leitor.close();
	}
		
}
