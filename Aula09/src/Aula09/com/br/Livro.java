package Aula09.com.br;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("Leitor = "+this.leitor.getNome());
		System.out.println("\nTítulo do livro = "+this.getTitulo());
		System.out.println("Autor do livro = "+this.getAutor());
		System.out.println("Total de páginas = "+this.getTotalPaginas());
		System.out.println("Página atual do livro = "+this.getPagAtual());
		System.out.println("Livro está aberto = "+this.getAberto());
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		if(!this.getAberto()) this.setAberto(true);
		else this.setAberto(false);
		
	}

	@Override
	public void fechar() {
		if(this.getAberto()) this.setAberto(false);
		else this.setAberto(true);
	}

	@Override
	public void folhear(int pag) {
		if(this.getAberto() && pag <= this.getTotalPaginas()) this.setPagAtual(pag);
		else System.out.println("O livro está fechado ou excedido o número de paginas");
	}

	@Override
	public void avancarPag() {
		if(this.getAberto() && this.getPagAtual() <= this.getTotalPaginas()) {
			this.setPagAtual(this.getPagAtual()+1);
		}else System.out.println("Impossivel avançar página, você está no final do livro");
	}

	@Override
	public void voltarPag() {
		if(this.getAberto()&& this.getPagAtual() > 0) {
			this.setPagAtual(this.getPagAtual()-1);
		}else System.out.println("Impossivel voltar página, você está no inicio do livro");
	}
	
	
	
}
