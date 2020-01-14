package br.ufpb.dcx.emissores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CaixaDeSom{

     private List < EmissorDeSom > emissores = new LinkedList < EmissorDeSom > ();
     
     public CaixaDeSom() {
    	 this.emissores = new ArrayList<EmissorDeSom>();
     }   
     
     public void adicionarEmissor(EmissorDeSom e){
    	 this.emissores.add(e);
     }
     
     
     public void tocarTodosOsEmissores(){
           for (EmissorDeSom e: emissores){
             System.out.println(e.emitirSom());
           }
     }
     
}
