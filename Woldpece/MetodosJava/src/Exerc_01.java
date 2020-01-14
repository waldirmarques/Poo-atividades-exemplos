//Não conseguir resolver o problema que a questão esta pedindo.
//Não ter como somar estrig com número inteiro
import javax.swing.JOptionPane;

public class Exerc_01 {
	
	public static String EnesimoNumero(int numero) {
		String numeroASomar = "";
		String aux = " ";
		String aux2 = "\n";
		for(int i = 0;i < numero; i++) {
			numeroASomar +=numero ;
			numeroASomar +=aux;
	
		}
		return numeroASomar;
	}
	
	public static void main(String[]args) {
		int num  = Integer.parseInt(JOptionPane.showInputDialog("Informe número: "));
		String resultado = EnesimoNumero(num);
		JOptionPane.showMessageDialog(null,resultado);
	}
}
