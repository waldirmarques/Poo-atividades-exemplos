package ufpb.br.RevisaoInterface;

public class Menu {
	public static void main(String[]args) {
		Gerente g = new Gerente("Waldir",20,"Masculino",0,12341,5);
		
		Funcionario f = g;
		f.setSalario(1000);
		System.out.println(f.getSalario());
	}
}
