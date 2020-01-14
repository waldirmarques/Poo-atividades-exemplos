import javax.swing.JOptionPane;

public class Exerc_03 {
	public static void main(String[]args) {
		String letra = JOptionPane.showInputDialog("Informe letra: ");
		
		if(letra.equals("M")) {
			JOptionPane.showMessageDialog(null,"M - Masculino! ");
		}else if(letra.equals("F")) {
			JOptionPane.showMessageDialog(null,"F - Feminino! ");
		}else {
			JOptionPane.showMessageDialog(null,"Letra informada não suportada! ");
		}
	}
}
