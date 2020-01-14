package ufpb.br.sisTelefone;

import java.util.List;

import javax.swing.JOptionPane;

public class TestaAgendaList {
	public static void main(String[]args) {
		Agenda agenda = new AgendaList();
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		String numero = JOptionPane.showInputDialog("Informe número: ");
		String operadora = JOptionPane.showInputDialog("Informe operadora: ");
		Contato novoContato = new Contato(nome,numero,operadora);
		agenda.cadastraContato(novoContato);
		List<Contato> lista = agenda.pesquisaContatosOperadora("OI");
		for(Contato c: lista) {
			System.out.println("Lista de operadora: "+c);
		}
	}
}
