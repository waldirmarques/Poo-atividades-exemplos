package ufpb.br.RevisãoPoliInter;

import java.util.ArrayList;

public class ColecaoDeProfessor implements Selecionavel {
	ArrayList<Professor> listProfessor;
	
	public ColecaoDeProfessor() {
		listProfessor = new ArrayList<>();
	}
	
	@Override
	public String getNomeBox(String nomePesquisar) {
		for(Professor i : listProfessor) if(i.getNome().startsWith(nomePesquisar)) return i.toString();		
		return null;
	}

}
