package Aula10;

public class Bolsista extends Aluno{
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando Bolsa");
	}
	
	public void pagarMensalidade() {
		System.out.println(this.getNome()+ " é bolsista! Pagamento facilitado");

	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
