package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="ITMN_EQUIPAMENTO")
public class Equipamento {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id  
	@Column(name="id_equip")
	private int id;

	@Column(name="hostname", length=50)
	private String hostname;

	@Column(name="ipaddr", length=15)
	private String ip;
	
	@JsonIgnoreProperties("equipamento")
	@OneToMany(mappedBy="equipamento" , cascade=CascadeType.ALL)
	private List <Evento> eventos;

	public Equipamento() {
		super();
	}

	public Equipamento(int id, String hostname, String ip, List<Evento> eventos) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
		this.eventos = eventos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}	
}