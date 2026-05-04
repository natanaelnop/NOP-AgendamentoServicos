package br.com.projeto.service;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import br.com.projeto.model.Agendamento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GerenciadorAgendamento {
	private List<Agendamento> agendamentos = new ArrayList<>();
	
	public void adicionar(Agendamento a) {
		agendamentos.add(a);
		System.out.println("Agendamento realizado com sucesso\n");
	}
	
	public void listar() {
		for (Agendamento a : agendamentos) {
			System.out.println("ID: "+a.getId()+"; Nome do Cidadao: "+a.getNomeCidadao()+"; Servico: "+a.getServico()+"; Telefone de contato: "+a.getTel()+"; Registrado em: "+a.getDataHora());
		}
	}
	
	public void salvarArquivo() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("agendamentos.txt"))) {
	        for (Agendamento a : agendamentos) {
	        	writer.write(a.getId() + ";" + a.getNomeCidadao() + ";" + 
                        a.getServico() + ";" + a.getTel() + ";" + a.getDataHora());
           writer.newLine();
       }
       System.out.println("Dados salvos com sucesso!");
   } catch (IOException e) {
       System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
   }
 }
	
	public void carregarArquivo() {
	    File arquivo = new File("agendamentos.txt");
	    if (!arquivo.exists()) return;
	    
	    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
	        String linha;
	        while ((linha = reader.readLine()) != null) {
	            String[] partes = linha.split(";");
	         // partes[0] = ID, partes[1] = Nome, partes[2] = Serviço, partes[3] = Telefone, partes[4] = Data
	            int id = Integer.parseInt(partes[0]);
	            String nome = partes[1];
	            String servico = partes[2];
	            String tel = partes[3];
	            LocalDateTime data = LocalDateTime.parse(partes[4]);
	            
	            Agendamento a = new Agendamento(id, nome, servico, tel, data);
	            agendamentos.add(a);
	        }
	      } catch (IOException e) {
	            System.err.println("Erro ao carregar o arquivo: " + e.getMessage());
	        }
	    }	         	
}