import java.util.ArrayList;

public class Editora{
	private EventoPublicacao evento;
	private ArrayList<EditoraListener> listaEventos;
	
	public Editora() {
		this.listaEventos = new ArrayList<>();
	}
	
	public void publicaReportagem(){
		this.notificaInteresadoReportagem();
	}
	
	public void publicaNoticia(){
		this.notificaInteresadoNoticia();
	}
	
	public void adicionaInteresado(EditoraListener interesado) {
		if(!this.listaEventos.contains(interesado)) {
			this.listaEventos.add(interesado);
		}
	}
	
	public void removerInteresado(EditoraListener desinteresado) {
		if(!this.listaEventos.contains(desinteresado)) {
			this.listaEventos.remove(desinteresado);
		}
	}
	
	public void notificaInteresadoNoticia() {
		for(EditoraListener e: listaEventos) {
			e.noticiaPublicada(evento);
		}
	}
	
	public void notificaInteresadoReportagem() {
		for(EditoraListener e: listaEventos) {
			e.reportagemPublicada(evento);
		}
	}
}
