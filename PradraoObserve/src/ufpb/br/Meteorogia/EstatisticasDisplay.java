package ufpb.br.Meteorogia;

public class EstatisticasDisplay implements Observer {
    private float temperatura;
    private float umidade;
    private float pressao;
    private EstacaoMeteorologica estado;
    
    public EstatisticasDisplay(EstacaoMeteorologica subject ){
        estado = subject;
        estado.addObserver( this );
    }
    
    private void display(){
        System.out.println("Temperatura: "+temperatura);
        System.out.println("Umidade: "+umidade);
        System.out.println("Pressao: "+pressao);
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        display();
    }
    
}