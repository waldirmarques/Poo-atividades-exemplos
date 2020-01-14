package ufpb.br.RevisãoPoliInter;

public class Disciplina {
	private String materia;
	
	public Disciplina(String materia) {
		this.setMateria(materia);
	}
	
	@Override
	public String toString() {
		return "Disciplina = "+this.getMateria();
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}
