package ufpb.br.Meteorogia;

public class MediaDisplay implements Observer {
    private EstacaoMeteorologica estacao;
    private float temperaturaMin, temperaturaMax, temperaturaMed;
    private float umidadeMin, umidadeMax, umidadeMed;
    private float pressaoMin, pressaoMax, pressaoMed;
    
    public MediaDisplay( EstacaoMeteorologica subject ){
        this.estacao = subject;
        this.estacao.addObserver(this);
    }
    
    public void display(){
        System.out.println("Temperatura média: "+temperaturaMed);
        System.out.println("Umidade média: "+umidadeMed);
        System.out.println("Pressão média: "+pressaoMed);
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        mediaTemperatura( temperatura );
        mediaUmidade( umidade );
        mediaPressao( pressao );
        display();
    }

	private void mediaPressao(float pressao) {
		// TODO Auto-generated method stub
		
	}

	private void mediaUmidade(float umidade) {
		// TODO Auto-generated method stub
		
	}

	private void mediaTemperatura(float temperatura) {
		// TODO Auto-generated method stub
		
	}

}
