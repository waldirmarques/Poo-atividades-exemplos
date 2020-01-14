package ufpb.br.SisInscrição;

import java.util.*;

public class SistemaInscricoesMenu {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		sistemaInscricoes novaInscricao = new sistemaInscricoes();
		
		System.out.println(toStringMenu());
		
		boolean fimDoPrograma = true;
		
		while(fimDoPrograma != false) {
			System.out.println("\nEscolha uma das opções abaixo:\n ");
			
			int escolha = InputDouble("1 - Cadastratar Participante: \n2 - Remover participante: \n"
					      +"3 - Pesquisa participante por instituição: \n4 - Pesquisa participante por Estado: \n"
					      +"5 - Sair:",leitor);
			switch(escolha){
			case 1:
				System.out.println("\nPara cadastrar um participante informe os seguintes dados abaixos\n");
				String logradouro = Input("Logradouro: ",leitor);
				String numero = Input("Número de sua casa: ",leitor);
				String cidade = Input("Cidade: ",leitor);
				String estado = Input("Estado: ",leitor);
				
				String nome = Input("Nome: ",leitor);
				String email = Input("Email: ",leitor);
				String instituicao = Input("Instituição: ",leitor);
				
				System.out.println("");
				
				Endereco novoEndereco = new Endereco(logradouro,numero,cidade,estado);
				Participantes novoParticipante = new Participantes(nome,email,instituicao,novoEndereco);
				
				System.out.println(novoParticipante.toString());
				
				System.out.println("");
				
				System.out.println("Confira todos os dados informados, e verifique se estão corretos ou incorretos, depois:"
								   +"\n\nDigite [ 1 ] para comfirmalos. Digite [ 0 ] para voltar ao inicio.");
				int verificacao = Integer.parseInt(leitor.nextLine());
				if(verificacao == 1) {
					System.out.println("");
					novaInscricao.cadastraParticipante(novoParticipante);
					System.out.println("\nCadastramento realizado com sucesso!");
					break;
				}else {
					System.out.println("\nPreencha novamente seus dados!");
					break;
				}
			
			case 2:
				System.out.println("\nPara remover um participante informe os seguintes dados abaixos\n");			
				String emailAprocurar = Input("Informe Email para remoção do participante:\n",leitor);
				novaInscricao.removerParticipante(emailAprocurar);
				System.out.println("\nRemoção realizada com sucesso!");
				break;
			
			case 3:
				System.out.println("\nPara pesquisar um participante informe os seguintes dados abaixos\n");
				String instituicaoAprocurar = Input("Informe Instituição para a pesquisa:\n ",leitor);
				ArrayList<Participantes> novaLista = novaInscricao.pesquisaParticipantesDaInstituicao(instituicaoAprocurar);				
				System.out.println(novaLista.toString());
				System.out.println("\nPesquisa Realizada com sucesso!");
				break;
			
			case 4:
				System.out.println("\nPara pesquisar participantes por Estados informe os seguintes dados abaixos\n");
				String EstadoAprocurar = Input("Informe Estado para a pesquisa:\n\n ",leitor);
				novaInscricao.pesquisaparticipantesDoEstado(EstadoAprocurar);
				System.out.println(novaInscricao.toString());
				System.out.println("\nPesquisa Realizada com sucesso!");
				break;
			
			case 5:
				fimDoPrograma = false;
				break;
			}
		}
		System.out.println("");
		System.out.println("Fim do programa");
	
		
		
		
	}
	
	public static String Input(String textoMostrado,Scanner leitor) {
		System.out.println(textoMostrado);
		return leitor.nextLine();
	}
	public static int InputDouble(String texto,Scanner leitor) {
		System.out.println(texto);
		int resultado = Integer.parseInt(leitor.nextLine());
		return resultado;
	}
	
	public static String toStringMenu() {
		return "###############################################################################################################"
				+"\n###############################################################################################################"
				+ "\n############################################### Sistema de Inscrições #########################################"
				+"\n###############################################################################################################"
				+"\n###############################################################################################################"
	            +"\n\n\n					Bem vindo ao sistema de inscrições\n\n\n\n";
	}
}
