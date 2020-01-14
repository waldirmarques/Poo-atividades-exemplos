package ufpb.br.Editora;

public class Menu {

	public static void main(String[] args) {
		Editora editora = new Editora();
		Portal portal = new Portal();
		
		Jornal j = new Jornal();
		editora.addInteresado(j);
		
		Portal p = new Portal();
		editora.addInteresado(p);
		
		Canal c = new Canal();
		editora.addInteresado(c);
		portal.addPagina(c);
		
		Fecebook f = new Fecebook();
		portal.addPagina(f);
		editora.addInteresado(f);
		
		EventoPublicado evento = new EventoPublicado("Lula Livre","Lula pode ser solto a qualquer momento pela policia Federeal");
		EventoPublicado evento2 = new EventoPublicado("Pagina web","Lula não se soltará");
		
		
		editora.publicaNoticia(evento);
		
		editora.publicaReportagem(evento);
		
		portal.noticia(evento2);

	}

}
