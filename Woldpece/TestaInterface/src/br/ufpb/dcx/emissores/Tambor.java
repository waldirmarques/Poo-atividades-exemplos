package br.ufpb.dcx.emissores;

public class Tambor implements EmissorDeSom {

	private String marca;
	private String tamanho; //P M G
	
	public Tambor(String marca,String tamanho) {
		this.marca = marca;
		this.tamanho = tamanho;
	}
	
	public String getmarca() {
		return this.marca;
	}
	public String gettamnho() {
		return this.tamanho;
	}
	
	public String emitirSom(){
		if(tamanho.equals("P")) {
			return "tum";
		}else if(tamanho.equals("M")){
			return "tum tum";
		}else {
			return "tum tum tum";
		}
	}
}
