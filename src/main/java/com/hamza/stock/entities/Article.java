package com.hamza.stock.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.javafx.binding.StringFormatter;


@Entity
@Table(name="article")
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idArticle;
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaire;
	
	private BigDecimal tauxTVA;
	
	private BigDecimal prixUnitaireTTC;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	public Article() {
		
	}

	public Long getIdArticle() {
		return idArticle;
	}


	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}


	public String getCodeArticle() {
		return codeArticle;
	}


	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}


	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}


	public BigDecimal getTauxTVA() {
		return tauxTVA;
	}


	public void setTauxTVA(BigDecimal tauxTVA) {
		this.tauxTVA = tauxTVA;
	}


	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}


	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
	
	
	
	

}
