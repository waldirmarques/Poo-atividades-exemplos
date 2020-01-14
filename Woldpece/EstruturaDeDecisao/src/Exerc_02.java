import javax.swing.JOptionPane;

public class Exerc_02 {
	public static void main(String[]args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe número: "));
		
		if(valor < 0) {
			JOptionPane.showMessageDialog(null,"O número informado é negativo! ");
		}else if(valor > 0) {
			JOptionPane.showMessageDialog(null,"O número informado é positivo! ");
		}else {
			JOptionPane.showMessageDialog(null,"O número informado é igual a zero! ");
		}
	}
}
