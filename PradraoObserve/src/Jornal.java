
public class Jornal implements EditoraListener {
	
	@Override
	public void noticiaPublicada(EventoPublicacao noticia) {
		System.out.println("Notificação Jornal");		
	}

	@Override
	public void reportagemPublicada(EventoPublicacao reportagem) {
		System.out.println("Notificação Jornal");	
	}
}
