import javax.swing.JOptionPane;

public class Exerc_08 {
	public static void main(String[]args) {
		double menor = 0;
		double maior = 0;
		int posicao = 0;
		for(int i = 0; i<3;i++) {
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe preço do "+(i+1)+"º produto"));
			if(preco >= maior) {
				maior = preco;
			}else if(preco <= maior) {
				menor = preco;
				posicao = i;
			}
		}
		JOptionPane.showMessageDialog(null,"Menor preço foi o "+(posicao++)+"º produto: "+menor);
	}
}
