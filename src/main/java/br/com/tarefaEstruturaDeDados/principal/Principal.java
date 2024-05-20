package br.com.tarefaEstruturaDeDados.principal;

import java.util.Scanner;

import br.com.tarefaEstruturaDeDados.estruturas.IntNoSimples;
import br.com.tarefaEstruturaDeDados.estruturas.ListaEncadeada;
import br.com.tarefaEstruturaDeDados.model.Aluno;


public class Principal {
	
	public void exibirMenu() {
		Integer opcao = 10;
		Scanner ler = new Scanner(System.in); 
		ListaEncadeada listaAluno = new ListaEncadeada(); 

		ListaEncadeada listaPresenca = new ListaEncadeada();
		
		
		while (opcao != 0) {
			System.out.println("Menu");
			System.out.println("  1-Cadastrar Aluno na Van");
			System.out.println("  2-Confirmar Presença");
			System.out.println("  3-Remover Presença");
			System.out.println("  4-Calcular Rota de Ida");
			System.out.println("  5-Calcular Volta");
			System.out.println("  6-Exibir Alunos");
			System.out.println("  0-Sair");
			opcao = ler.nextInt();
			ler.nextLine();
			switch (opcao) {
			case 1:
				
				Aluno aluno = new Aluno();
				IntNoSimples valorAluno = new IntNoSimples(aluno);
				System.out.println("Digite o nome do Aluno:");
				aluno.setNome(ler.nextLine());
				System.out.println("Digite a distancia");
				aluno.setDistancia(ler.nextInt());
				ler.nextLine();
				listaAluno.insereNo_fim(valorAluno);
				System.out.println("Cadastrado com sucesso");
				break;
				
			case 2:
				
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("----------------------------------Lista de Alunos------------------------------------");
				listaAluno.exibeLista();
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				String pesquisa;				
				System.out.println("Qual aluno confirmou presença?");
				pesquisa = ler.nextLine();
				IntNoSimples presencaAluno = new IntNoSimples(listaAluno.buscaNo(pesquisa));				
				listaPresenca.insereNo_inicio(presencaAluno);
						
				break;
			case 3:

				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("----------------------------------Lista de presença------------------------------------");
				listaPresenca.exibeLista();
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				String pesquisaa;				
				System.out.println("Qual aluno desmarcou?");
				pesquisaa = ler.nextLine();
				listaPresenca.excluiNo(listaPresenca.buscaNo(pesquisaa));
						
				break;
			case 4:
				
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------Lista de Ida Hoje-------------------------------------------");
				listaPresenca.exibeListaParaArvore();
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
					
				break;
			
			case 5:
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------Lista De Volta Hoje------------------------------------------");
				listaPresenca.exibeListaParaVolta(listaPresenca.ContarNos());
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				
				break;
				

			case 6:
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("----------------------------------Lista de Alunos------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				listaAluno.exibeLista();
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("----------------------------------Lista de Presenca------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				listaPresenca.exibeLista();
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("----------------------------Lista de ordem para pegar alunos--------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				listaAluno.exibeListaParaArvore();
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("----------------------------Lista de ordem para Voltar---------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				listaAluno.exibeListaParaVolta(listaAluno.ContarNos());
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("-------------------------------------------------------------------------------------");
				break;

			default:
				break;
			}
			
		}
	}

}
