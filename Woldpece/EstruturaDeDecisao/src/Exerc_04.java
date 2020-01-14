import javax.swing.JOptionPane;

public class Exerc_04 {
	public static void main(String[]args) {
		String con = "a e i o u";
		String vogal [] = con.split("");
		boolean verdade = false;
		
		String entrada = JOptionPane.showInputDialog("Informe letra; ");
		
		for(int i = 0; i < vogal.length;i++) {
			if(entrada.equals(vogal[i])) {				
				verdade = true;
				i = vogal.length;				
			}
		}
		
		if(verdade) {
			JOptionPane.showMessageDialog(null,"É vogal");
		}else {
			JOptionPane.showMessageDialog(null,"É consoante");
		}
		
	}
}
