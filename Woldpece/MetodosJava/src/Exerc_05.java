import javax.swing.JOptionPane;

public class Exerc_05 {
	
	public static double taxaInposto(double vendas, int porcentagem) {
		double resposta = vendas*porcentagem/100;
		return resposta;
	}
	public static double somaImposto(double valorVendas, double resultado) {
		double soma = valorVendas + resultado;
		return soma;
	}	
	
	public static void main(String[]args) {
		double ValorProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
		int porsentagem = Integer.parseInt(JOptionPane.showInputDialog("Informe valor da porsentagem: "));
		double retorno1 = taxaInposto(ValorProduto,porsentagem);
		double NovoValor = somaImposto(ValorProduto,retorno1);
		
		JOptionPane.showMessageDialog(null, "Resultado final: "+NovoValor);
	}
}
