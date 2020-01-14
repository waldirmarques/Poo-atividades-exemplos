
public class Reportagem implements EditoraListener {
	
	@Override
	public void noticiaPublicada(EventoPublicacao noticia) {
		System.out.println("Notificação Reportagem");
	}

	@Override
	public void reportagemPublicada(EventoPublicacao reportagem) {
		System.out.println("Notificação Reportagem");
	}
}
