package Aula10;

public class Menu {
	public static void main(String[]args) {
	
		Aluno a1 = new Aluno();
		//Funcionario p3 = new Funcionario();
		//Professor p4 = new Professor();
		//Visitante v1 = new Visitante();
		Bolsista b = new Bolsista();
		
		//v1.setNome("Waldir");
		a1.setNome("João");
		a1.setMatricula(2222);
		a1.setCurso("Sistema de informação");
		a1.setIdade(20);
		a1.setSexo("M");
		a1.pagarMensalidade();
		//p3.setNome("Bruno");
		//p4.setNome("Fabio");
		
		//p4.setSalario(500);
		b.setNome("Carlos");
		b.setMatricula(22766);
		b.setCurso("Sistema");
		b.setIdade(20);
		b.setSexo("M");
		b.setBolsa(87);
		b.pagarMensalidade();
		
		System.out.println(a1.toString());
	}
}
