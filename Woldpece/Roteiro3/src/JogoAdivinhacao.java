import javax.swing.JOptionPane;

public class JogoAdivinhacao {
	public static void main(String[]args) {
		int numProcurado = Integer.parseInt(JOptionPane.showInputDialog("Informe número para ser adivinhado: "));
		int pontos = 100;
		int tentativas = 0;
		boolean adivinhou = true;
		
		while(adivinhou) {
			tentativas++;			
			int numLido = Integer.parseInt(JOptionPane.showInputDialog("Informe número a ser adivinhado; "));
			
			if(numProcurado == numLido) {
				pontos /= tentativas;
				JOptionPane.showMessageDialog(null,"Parabéns vc acertou o número!!!");
				JOptionPane.showMessageDialog(null,"Quantidade de tentativas: "+tentativas);
				JOptionPane.showMessageDialog(null,"Sua pontuação foi: "+pontos+" pontos");
				adivinhou = false;
			}else if(numProcurado > numLido){
				JOptionPane.showMessageDialog(null,"Número Lido menor que o número a adivinhar!");
			}else if(numProcurado < numLido) {
				JOptionPane.showMessageDialog(null,"Número Lido maior que o número a adivinhar!");
			}
		}
	}		
}
