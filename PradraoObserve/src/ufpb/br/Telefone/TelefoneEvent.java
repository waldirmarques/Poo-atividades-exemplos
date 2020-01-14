package ufpb.br.Telefone;

public class TelefoneEvent {
	private int numero;
	private String dataHora;
	
	public TelefoneEvent(int numero,String dataHora){
		this.setNumero(numero);
		this.setDataHora(dataHora);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
	
}
