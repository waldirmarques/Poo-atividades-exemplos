
public class Despesa {
	
	private String descricao;
	private double valor;
	
	public Despesa(String desc, double val) {
		this.descricao = desc;
		this.valor = val;
	}
	
	public String getDescrisao() {
		return this.descricao;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double novoValor) {
		this.valor = novoValor;
	}
}
