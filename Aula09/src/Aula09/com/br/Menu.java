package Aula09.com.br;

public class Menu {
	public static void main(String[]args) {
		
		Pessoa p = new Pessoa("Waldir Marques",20,"Masculino");
		
		//p.fazerAniversario();
		
		Livro l = new Livro("O poder do hábito","Charles Dunngg",360,p);
		l.abrir();
		//l.voltarPag();
		//l.avancarPag();
		l.folhear(500);
		//l.fechar();
		l.detalhes();
	}
}
