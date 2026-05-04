package br.com.projeto.main;

import java.time.LocalDateTime;
import br.com.projeto.model.Agendamento;
import br.com.projeto.service.GerenciadorAgendamento;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GerenciadorAgendamento gerenciador = new GerenciadorAgendamento();
		int opcao = -1;

		gerenciador.carregarArquivo();
		while (opcao != 0) {
			System.out.println("** Sistema de Agendamento **");
			System.out.println("1 - Novo Agendamento");
			System.out.println("2 - Listar Agendamentos");
			System.out.println("0 - sair");
			System.out.println("Escolha uma opcao: ");
			
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao){
				case 1:
					System.out.println("Nome do Cidadao: ");
					String nomeCidadao = scan.nextLine();
					
					System.out.println("Tipo de servico: ");
					String servico = scan.nextLine();
					
					System.out.println("Telefone de contato: ");
					String tel = scan.nextLine();
					
					Agendamento novo = new Agendamento(nomeCidadao,servico,tel,LocalDateTime.now());
					gerenciador.adicionar(novo);
					gerenciador.salvarArquivo();
					break;
				
				case 2:
					System.out.println("-- Lista de Agendamentos --");
					gerenciador.listar();
					System.out.println("\n");
					break;
					
				case 0:
					System.out.println("Saindo...");
					gerenciador.salvarArquivo();
					break;
					
				default:
					System.out.println("Opcao envalida");
			}	
			
		}
		scan.close();
	}
}