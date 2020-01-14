package ufpb.br.Countin_Sort;

public class Coutin_Sorte {
	
	private int maior;
	private int menor;
	
	public int[] countinSorte(int[] lista) {
		
		this.achaOMaior(lista);
		
		int auxiliar[] = new int [this.maior - this.menor + 1];
		
		int saida[] = new int[lista.length];
		
		for(int i = 0; i < auxiliar.length; i++) {
			auxiliar[i] = 0;
		}
		
		for(int i = 0; i < lista.length; i++) {
			auxiliar[lista[i] - this.menor] += 1;
		}
		
		for(int i = 1; i < auxiliar.length;i++) {
			auxiliar[i] += auxiliar[i-1];
		}
		
		for(int i = 1; i<lista.length;i++) {
			saida[auxiliar[lista[i]]-- -1] = lista[i];
		}
		
		
		return saida;
	}
	
	public void achaOMaior(int[] lista) {
		this.maior = Integer.MIN_VALUE;
		this.menor = Integer.MAX_VALUE;
		
		for(int i = 0;i<lista.length;i++) {
			if(lista[i] < this.menor) {
				this.menor = lista[i];
			}if(lista[i]>this.maior) {
				this.maior = lista[i];
			}
		}
	}
	
	
	public static void main(String[]args) {
		int entrada[] = {0,0, 2, 3, 0,5,4,3,2,2,1,9};
		
		Coutin_Sorte cs = new Coutin_Sorte();
		int []saida = cs.countinSorte(entrada);
		
		for(int i: saida) {
			System.out.println(i);
		}
	}

}
