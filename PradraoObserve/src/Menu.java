
public class Menu {
	
	public static void main(String[] args) {
		Editora editora = new Editora();
		
		Jornal j = new Jornal();
		Reportagem r = new Reportagem();
		
		editora.adicionaInteresado(j);
		editora.adicionaInteresado(r);
		
		EventoPublicacao i = new EventoPublicacao("primeiro evento notícia");
		
		editora.publicaReportagem();
		editora.publicaNoticia();
		
		
		

	}

}
