package ufpb.br.Telefone;

import java.util.ArrayList;

public class Telefone {
	private ArrayList<TelefoneListener> telefone;
	private TelefoneEvent event;
	
	public Telefone() {
		this.telefone = new ArrayList<>();
	}
	
	public void tocaTelefone() {
		this.disparaTelefoneTocou();
	}
	public void atendeTelefone() {
		this.disparaTelefoneAtendido();
	}
	public void addListiner(TelefoneListener telefone) {
		if(!this.telefone.contains(telefone)) {
			this.telefone.add(telefone);
		}
	}
	public void removeListener(TelefoneListener telefone) {
		if(this.telefone.contains(telefone)) {
			this.telefone.remove(telefone);
		}
	}
	public void disparaTelefoneTocou() {
		for(TelefoneListener i: this.telefone) {
			i.telefoneTocou(event);
		}
	}
	public void disparaTelefoneAtendido() {
		for(TelefoneListener i: this.telefone) {
			i.telefoneAtendido(event);
		}
	}
	
	public TelefoneEvent getEvent() {
		return this.event;
	}
}
