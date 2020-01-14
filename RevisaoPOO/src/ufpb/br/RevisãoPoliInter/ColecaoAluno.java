package ufpb.br.RevisãoPoliInter;

import java.util.ArrayList;

public class ColecaoAluno implements Selecionavel {
	private ArrayList<Aluno> listAluno;
	
	public ColecaoAluno() {
		listAluno = new ArrayList<>();
	}
	@Override
	public String getNomeBox(String nomePesquisar) {
		for(Aluno i : listAluno) if(i.getNome().startsWith(nomePesquisar)) return i.toString();
		return null;
	}

}
