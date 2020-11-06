package br.com.projetofinal.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="ITMN_EVENTO")
public class Evento {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="num_seq")
	private int numSeq;

	@Temporal(TemporalType.DATE)
	@Column(name="data")
	private Date data;

	@JsonIgnoreProperties("eventos")
	@ManyToOne
	private Alarme alarme;
	
	@JsonIgnoreProperties("eventos")
	@ManyToOne
	private Equipamento equipamento;
	
	public Evento() {
		super();
	}

	public Evento(int numSeq, Date data, Alarme alarme, Equipamento equipamento) {
		super();
		this.numSeq = numSeq;
		this.data = data;
		this.alarme = alarme;
		this.equipamento = equipamento;
	}

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Alarme getAlarme() {
		return alarme;
	}

	public void setAlarme(Alarme alarme) {
		this.alarme = alarme;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
}
