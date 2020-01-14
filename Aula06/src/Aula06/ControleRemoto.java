package Aula06;

public class ControleRemoto implements Controlador{
	
	private int volume;
	private boolean lidado;
	private boolean tocando;
	
	public ControleRemoto(){
		this.volume = 50;
		this.lidado = false;
		this.tocando = false;
	}
	@Override
	public void ligar() {
		this.setLidado(true);
	}

	@Override
	public void desligar() {
		this.setLidado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLidado()) System.out.println("Volume : "+this.volume+"\nLigado : "+this.lidado+"\nTocando : "+this.tocando);
		else System.out.println();
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");;
	}

	@Override
	public void maisVolume () {
		if(this.getLidado())this.setVolume(this.getVolume()+5);
		
	}

	@Override
	public void menosVolume() {
		if(this.getLidado()) this.setVolume(this.getVolume()-5);
		
	}

	@Override
	public void ligarMudo() {
		if(this.getVolume() > 0 && this.getLidado()) this.setVolume(0);
	}

	@Override
	public void desligarMudo() {
		if(this.getVolume() == 0 && this.getLidado()) this.setVolume(50);
	}

	@Override
	public void play() {
		if(this.getTocando() == false && this.getLidado())this.setTocando(true);
	}

	@Override
	public void pausar() {
		if(this.getTocando() && this.getTocando()) this.setTocando(false);
	}
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLidado() {
		return lidado;
	}
	private void setLidado(boolean lidado) {
		this.lidado = lidado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	

}
