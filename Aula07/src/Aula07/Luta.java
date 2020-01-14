package Aula07;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int raunds;
	private boolean aprovado;
	
	public void marcarLuta(Lutador L1,Lutador L2) {
		if(L1.getCategaria().equals(L2.getCategaria()) && L1.getNome() != L2.getNome()) {
			this.setAprovado(true);
			this.setDesafiado(L1);
			this.setDesafiante(L2);
		}else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.getAprovado()) {
			System.out.println(" O desafiante ");
			this.desafiado.apresentar();
			System.out.println("\n O desafiado ");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			System.out.println("===================== RESULTADO DA LUTA ===================");
			switch(vencedor) {
			
				case 0:
					System.out.println("\n\nVitória do "+this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 1:
					System.out.println("\n\nVitória do "+this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				case 2:
					System.out.println("\n\nEmpate dos lutadores "+this.desafiado.getNome()+" e "+this.desafiante.getNome());
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
			}
		
		}else System.out.println("Luta não pode acontecer!");
	}

	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador dasafiado) {
		this.desafiado = dasafiado;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRaunds() {
		return raunds;
	}

	public void setRaunds(int raunds) {
		this.raunds = raunds;
	}

	public boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	
}
