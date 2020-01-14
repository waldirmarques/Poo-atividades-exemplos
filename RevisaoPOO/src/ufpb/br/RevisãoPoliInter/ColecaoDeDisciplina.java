package ufpb.br.RevisãoPoliInter;

import java.util.ArrayList;

public class ColecaoDeDisciplina implements Selecionavel {
	ArrayList<Disciplina> listDisciplina;
	
	public ColecaoDeDisciplina() {
		listDisciplina = new ArrayList<>();
	}
	
	@Override
	public String getNomeBox(String nomePesquisar) {
		for(Disciplina i : listDisciplina) if(i.getMateria().startsWith(nomePesquisar)) return i.toString();		
		return null;
	}

}
