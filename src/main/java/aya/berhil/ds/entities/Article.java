package aya.berhil.ds.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private Date dateProduction;
	
	@ManyToOne
	private Categorie categorie;
	
	
	
	public Article() {
		super();
	}

	public Article(String nom, Date dateProduction) {
		super();
		this.nom = nom;
		this.dateProduction = dateProduction;
	}
	
	

	public Article(String nom, Date dateProduction, Categorie categorie) {
		super();
		this.nom = nom;
		this.dateProduction = dateProduction;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateProduction() {
		return dateProduction;
	}

	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
	
	
	

}
