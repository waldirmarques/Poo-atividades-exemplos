import javax.swing.JOptionPane;

public class Exerc_05 {
	public static void main(String[]args) {
		double notaAluno = 0;
		
		for(int i = 0; i<2; i++) {
			notaAluno += Double.parseDouble(JOptionPane.showInputDialog("Informe nota do "+(i+1)+"º"));
		}
		
		double media = notaAluno/2;
		
		if(media >= 7 && media != 10) {
			JOptionPane.showMessageDialog(null,"Aprovado");
		}else if(media <= 7) {
			JOptionPane.showMessageDialog(null,"Reprovado");
		}else {
			JOptionPane.showMessageDialog(null,"Aprovado com Distinção");
		}
	}
}
