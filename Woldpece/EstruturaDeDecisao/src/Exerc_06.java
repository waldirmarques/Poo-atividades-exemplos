import javax.swing.JOptionPane;

public class Exerc_06 {
	public static void main(String[]args) {
		double maior = 0;
		int cont = 0;
		
		while(cont < 3) {
			double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe "+(cont+1)+"º número: "));
			if(numero >= maior) {
				maior = numero;
			}
			cont++;
		}
		
		JOptionPane.showMessageDialog(null,"O maior número informado foi "+maior);
	}
}
