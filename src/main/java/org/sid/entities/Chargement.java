package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Chargement implements Serializable{
	@Id  @GeneratedValue
	private Long id_chargement ;
	private Date datec ;
	private int montantc ;
	private String num_compte ;
	public Chargement() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Client_pro client_pro;
	public Chargement(Date datec, int montantc, String num_compte) {
		super();
		this.datec = datec;
		this.montantc = montantc;
		this.num_compte = num_compte;
	}
	public Long getId_chargement() {
		return id_chargement;
	}
	public void setId_chargement(Long id_chargement) {
		this.id_chargement = id_chargement;
	}
	public Date getDatec() {
		return datec;
	}
	public void setDatec(Date datec) {
		this.datec = datec;
	}
	public int getMontantc() {
		return montantc;
	}
	public void setMontantc(int montantc) {
		this.montantc = montantc;
	}
	public String getNum_compte() {
		return num_compte;
	}
	public void setNum_compte(String num_compte) {
		this.num_compte = num_compte;
	}


}
