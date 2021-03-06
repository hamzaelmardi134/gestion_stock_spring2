package com.hamza.stock.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ligne_commande_fournisseur")
public class LigneCommandeFournisseur implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_ligne_cde_fournisseur")
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
	

}
