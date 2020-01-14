import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestaLista {
	public static void main(String[]args) {
		
		ArrayList<String> listaPalavras = new ArrayList<String>();
		
		System.out.println("Vamos ler algumas palvras: ");
		
		System.out.println("Quantas palavras vc quer ler: ");
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Quantas palavras vc quer ler: "));
		
		for(int k = 0; k < numero; k++) {
			String p = JOptionPane.showInputDialog("Quantas palavras vc quer ler: ");
			listaPalavras.add(p);
		}
		
		System.out.println("Palavras lidas:");
		for(String palavra: listaPalavras) {
			System.out.println(palavra);
		}
		
		
		
		/*
		System.out.println("Palavras lidas:");
		for(int i = 0; i < listaPalavras.size();i++) {
			String palavra = listaPalavras.get(i);
			System.out.println(palavra);
		}
		*/
	}
}
