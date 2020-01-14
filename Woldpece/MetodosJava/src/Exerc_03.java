import javax.swing.JOptionPane;

public class Exerc_03 {
	public static int Somatorio(int num1,int num2, int num3) {
		int soma = num1+num2+num3;
		return soma;
	}
	public static void main(String[]args) {
		int PrimeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe primeiro número: "));
		int SegundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe segundo número: "));
		int TerceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe terceiro número:"));
		
		int resultado = Somatorio(PrimeiroNumero,SegundoNumero,TerceiroNumero);
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
