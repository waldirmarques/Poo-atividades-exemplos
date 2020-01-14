package br.ufpb.dcx.emissores;

public class Cachorro implements EmissorDeSom {
	   private String nome; 
	   public Cachorro(String nome){
	       this.nome = nome;
	   }
	   
	   public String getnome() {
		   return this.nome;
	   }
	   
	   public String emitirSom(){
	       return "au au";
	   }
	}
