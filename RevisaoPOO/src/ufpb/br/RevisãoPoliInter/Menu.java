package ufpb.br.RevisãoPoliInter;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		ArrayList<Aluno> listColecaoAluno = new ArrayList<>();
		ArrayList<Professor> listColecaoProfessor = new ArrayList<>();
		ArrayList<Disciplina> listColecaoDisciplina = new ArrayList<>();

		Scanner leitor = new Scanner(System.in);
		String opcaoDoSistema = inputString("========================== SISTEMA TESTE REVISÂO POO =========================="+
		"\n\n1- Cadastrar Aluno no sistema \n2- Cadastrar Professor no sistema \n3- Cadastrar Disciplina no sistema"+
		"\n4- Pesquisa usuários ou disciplina no sistema\n\n===============================================================================",leitor);
		boolean opcaoSair = true;
		
		while(!opcaoSair){
			switch(opcaoDoSistema) {
				case "1":
					String nomeAluno = inputString("Informe nome do aluno: ",leitor);
					String cpfAluno = inputString("Informe cpf do aluno: ",leitor);
					int idadeAluno = inputInt("Informe idade do aluno: ",leitor);
					String matricula = inputString("Informe matricula do aluno: ",leitor);
					Aluno aluno = new Aluno(nomeAluno,cpfAluno,idadeAluno,matricula);
					listColecaoAluno.add(aluno);
					System.out.println("Aluno cadastrado com sucesso!");
				case "2":
					String nomeProfessor = inputString("Informe nome do aluno: ",leitor);
					String cpfProfessor = inputString("Informe cpf do aluno: ",leitor);
					int idadeProfessor = inputInt("Informe idade do aluno: ",leitor);
					double salario = inputDouble("Informe matricula do aluno: ",leitor);
					Professor professor = new Professor(nomeProfessor,cpfProfessor,idadeProfessor,salario);
					listColecaoProfessor.add(professor);
					System.out.println("Professor cadastrado com sucesso!");
				case "3":
					String nomeDisciplina = inputString("Informe nome da disciplina: ",leitor);
					Disciplina disciplina = new Disciplina(nomeDisciplina);
					listColecaoDisciplina.add(disciplina);
					System.out.println("Disciplina cadastrada com sucesso!");
				case "4":
				
			}
			
		}

	}
	
	public static String inputString(String texto,Scanner leitor) {
		System.out.println(texto);
		return leitor.nextLine();
	}
	
	public static int inputInt(String texto,Scanner leitor) {
		System.out.println(texto);
		return Integer.parseInt(leitor.nextLine());
	}
	
	public static double inputDouble(String texto,Scanner leitor) {
		System.out.println(texto);
		return Double.parseDouble(leitor.nextLine());
	}

}
