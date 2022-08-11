package tn.esprit.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(	name = "demission")
public class Demission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String etat;
	private String pc;
	private String portable;
	private String clés;
	@OneToOne
	@JoinColumn(name = "prestataire_id" , referencedColumnName = "id" )
	private Prestataire prestataire;
	public Demission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demission(Long id, String etat, String pc, String portable, String clés, Prestataire prestataire) {
		super();
		this.id = id;
		this.etat = etat;
		this.pc = pc;
		this.portable = portable;
		this.clés = clés;
		this.prestataire = prestataire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	public String getClés() {
		return clés;
	}
	public void setClés(String clés) {
		this.clés = clés;
	}
	public Prestataire getPrestataire() {
		return prestataire;
	}
	public void setPrestataire(Prestataire prestataire) {
		this.prestataire = prestataire;
	}
	
	
	
}
