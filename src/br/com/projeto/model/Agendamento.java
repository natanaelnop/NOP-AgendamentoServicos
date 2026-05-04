package br.com.projeto.model;
import java.time.LocalDateTime;

public class Agendamento {
	private static int contador = 0;
	
	private int id;
	private String nomeCidadao;
	private String servico;
	private String tel;
	private LocalDateTime dataHora;
	
	@Override
	public String toString() {
		return "Agendamento [id=" + id + ", nomeCidadao=" + nomeCidadao + ", servico=" + servico + ", Telefone de contato="+tel+ ", dataHora="
				+ dataHora + "]";
	}

	public Agendamento(String nomeCidadao, String servico, String tel, LocalDateTime dataHora) {
		contador++;
		this.id = contador;
		this.nomeCidadao = nomeCidadao;
		this.servico = servico;
		this.tel = tel;
		this.dataHora = dataHora;
	}
	
	public Agendamento(int id, String nomeCidadao, String servico, String tel, LocalDateTime dataHora) {
	    this.id = id;
	    this.nomeCidadao = nomeCidadao;
	    this.servico = servico;
	    this.tel = tel;
	    this.dataHora = dataHora;
	    
	    if (id >= contador) {
	        contador = id;
	    }
	}

	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}

	public String getNomeCidadao() {
		return nomeCidadao;
	}

	public void setNomeCidadao(String nomeCidadao) {
		this.nomeCidadao = nomeCidadao;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
}