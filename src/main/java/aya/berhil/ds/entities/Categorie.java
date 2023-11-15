package aya.berhil.ds.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	
	@OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER, cascade = CascadeType.ALL )
	private List<Article> articles;

	@ManyToOne
	@JsonIgnore
	private Categorie categoriez;
	

	public Categorie() {
		super();
	}


	public Categorie(String nom, List<Article> articles) {
		super();
		this.nom = nom;
		this.articles = articles;
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


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}


	public Categorie getCategoriez() {
		return categoriez;
	}


	public void setCategoriez(Categorie categoriez) {
		this.categoriez = categoriez;
	}
	
	
	
	
	
	
}
