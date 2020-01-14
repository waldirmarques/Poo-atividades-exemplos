package ufpb.br.Meteorogia;

import java.util.ArrayList;

public class EstacaoMeteorologica{
    private float temperatura;
    private float umidade;
    private float pressao;
    private ArrayList<Observer> observers;
    
    public EstacaoMeteorologica() {
    	this.observers = new ArrayList<>();
	}

    public void setMedicoes( float temperatura, float umidade, float pressao ){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notifyObservers();
    }

    
    public void addObserver(Observer observer) {
        if(!this.observers.contains(observer)) {
        	observers.add( observer );
        }
    }

    public void removeObserver(Observer observer) {
        if(this.observers.contains(observer)){
            observers.remove( observer );
        }
    }

    public void notifyObservers() { 
        for( Observer o :observers ){
            o.update( temperatura, umidade, pressao );
        }
    }
}