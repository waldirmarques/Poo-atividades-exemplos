import javax.swing.JOptionPane;

public class Exerc_01 {
	public static void main(String[]args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe 1º número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe 2º número: "));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null,"1º número é o maior! ");
		}else if(num1 < num2) {
			JOptionPane.showMessageDialog(null,"2º número é maior! ");
		}else {			
			JOptionPane.showMessageDialog(null,"Os números são iguais! ");
		}
	}
}