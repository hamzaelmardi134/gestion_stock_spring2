package com.hamza.stock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="categorie")
public class Categorie implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_categorie")
	private Long idCategorie;
	
	
	private String codeCategorie;
	
	private String designationCategorie;
	
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;
	
	
	public Categorie() {
		
	}
	

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getDesignationCategorie() {
		return designationCategorie;
	}

	public void setDesignationCategorie(String designationCategorie) {
		this.designationCategorie = designationCategorie;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	
	
	
	
	

}
