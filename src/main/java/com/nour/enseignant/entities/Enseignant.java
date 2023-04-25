package com.nour.enseignant.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnseignant;
   
   

	private String nomEnseignant;

    private String villeEnseignant; 

    private Date dateNaissance;
    private double salaire;
    
    @ManyToOne
    private University Unv;


    
	public Enseignant() {
		super();
	}



	public Enseignant(long idEnseignant, String nomEnseignant, String villeEnseignant, Date dateNaissance,
			double salaire, University unv) {
		super();
		this.idEnseignant = idEnseignant;
		this.nomEnseignant = nomEnseignant;
		this.villeEnseignant = villeEnseignant;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
		Unv = unv;
	}



	public long getIdEnseignant() {
		return idEnseignant;
	}



	public void setIdEnseignant(long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}



	public String getNomEnseignant() {
		return nomEnseignant;
	}



	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}



	public String getVilleEnseignant() {
		return villeEnseignant;
	}



	public void setVilleEnseignant(String villeEnseignant) {
		this.villeEnseignant = villeEnseignant;
	}



	public Date getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	public University getUnv() {
		return Unv;
	}



	public void setUnv(University unv) {
		Unv = unv;
	}



	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + ", villeEnseignant="
				+ villeEnseignant + ", dateNaissance=" + dateNaissance + ", salaire=" + salaire + ", Unv=" + Unv + "]";
	}



	
}
