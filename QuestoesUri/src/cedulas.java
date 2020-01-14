import java.util.Scanner;

public class cedulas {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		int divisores [] = {100,50,20,10,5,2,1};
		
		int entrada = Integer.parseInt(leitor.nextLine());
		
		int res100 = entrada / divisores[0];
		int res1 = entrada % divisores[0];
		
		int res50 = res1 / divisores[1];
		int res2 = res1 % divisores[1];
		
		int res20 = res2 / divisores[2];
		int res3 = res2 % divisores[2];
		
		int res10 = res3 / divisores[3];
		int res4 = res3 % divisores[3];
		
		int res05 = res4 / divisores[4];
		int res5 = res4 % divisores[4];
		
		int res02 = res5 / divisores[5];
		int res6 = res5 % divisores[5];
		
		int res01 = res6 / divisores[6];
		
		
		System.out.println(res100+" nota(s) de R$ 100,00");
		System.out.println(res50+" nota(s) de R$ 50,00");
		System.out.println(res20+" nota(s) de R$ 20,00");
		System.out.println(res10+" nota(s) de R$ 10,00");
		System.out.println(res05+" nota(s) de R$ 5,00");
		System.out.println(res02+" nota(s) de R$ 2,00");
		System.out.println(res01+" nota(s) de R$ 1,00");
		
		leitor.close();
	}
}
