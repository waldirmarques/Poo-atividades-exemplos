import javax.swing.JOptionPane;
//import java.util.Scanner;
public class CuriosidadeMaldita {
	public static void MenuInicial() {
		JOptionPane.showMessageDialog(null, "Bem vido ao Joguinho sobre mim");
		String opção = JOptionPane.showInputDialog("Você tem certeza que quer realmente me conhecer melhor...\n S/N ? ");
		if(opção.equals("S")) {
			JOptionPane.showMessageDialog(null,"Parabéns por ser tão corajosa então...\nkkkkkkkkkkkkkkkkkk");
			JOptionPane.showMessageDialog(null,"É brincadeira, não se preocupa!\nNão terá coisas aqui que te causaram mal kkkkk\n"
					+ "A não ser meus segredos bombasticos!!!!");
			String SimOuNao = JOptionPane.showInputDialog("Vamos lá me conhecer melhor então...\nS/N ?");
			if (SimOuNao.equals("N")){
				JOptionPane.showMessageDialog(null,"Obrigado por ter chegado até aqui...");
				JOptionPane.showMessageDialog(null,"E uma pena você não ter continuado...");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Que pena que você não quiz me conhecer melhor!");
			JOptionPane.showMessageDialog(null, "Então é isso!!,\ndesculpas por te causar tanto constrancimento kkkkkkkkkk!!!");
		}		
	}
	public static void Explicacao() {
		JOptionPane.showMessageDialog(null,"Mais antes eu quero te dizer que foi culpa sua eu ter feito isso viu..."
				+ "\nDeixa uma pessoa curiosa é uma coisa muito crueu kkkkkk...\n"
				+ "Sua sorte é que depois você meio que se arrependeu, e me falou um pouco do que se tratava...\n"
				+ "Se não eu iria pegar mais pesado...");
		JOptionPane.showMessageDialog(null,"Mais enfim, já que eu fiz essa lezerisse, então vamos brincar um pouco né kkkkkkk");
		JOptionPane.showMessageDialog(null, "Esse joguinho fuleira, FEITO POR MIM é claro, tem o objetivo de me apresentar melhor para você.\n"
				+ "Vai funcior assim, vai ter perguntas já respondidas por mim, e as quais seram mostradas para que você possa responder\n"
				+ "E no final eu mostro minhas respostas é faremos uma media de quantas coisas sobre mim você sabe...\n"
				+ "Dependendo da quantidade de respostas que vc acertar, você tem o direito de saber algo especifico sobre mim...");
	}
	public static void main(String[]args) {
		//MenuInicial();
		Explicacao();
	}

}
