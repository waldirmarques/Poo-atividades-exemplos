package ufpb.br.Meteorogia;

public class PressaoAtmosfericaDisplay implements Observer{
    private float temperatura;
    private float pressao;
    private EstacaoMeteorologica estacao;
    
    public PressaoAtmosfericaDisplay(EstacaoMeteorologica es ){
        this.estacao = es;
        this.estacao.addObserver(this);
    }
    
    public void display(){
        System.out.println("Pressão atmosférica: "+calcPressaoAtmosferica());
    }

    private String calcPressaoAtmosferica() {
		return null;
	}

	@Override
    public void update(float temperatura, float umidade, float pressao) {
        this.setTemperatura(temperatura);
        this.setPressao(pressao);
        display();
    }

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
   
}
