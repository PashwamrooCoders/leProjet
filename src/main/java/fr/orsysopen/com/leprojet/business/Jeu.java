package fr.orsysopen.com.leprojet.business;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Jeu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateSortie;
	private String image;
	
	
	public Jeu() {
	}

	public Jeu(String nom, String description, LocalDate dateSortie, String image) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateSortie = dateSortie;
		this.image = image;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Jeu [id=" + id + ", nom=" + nom + ", description=" + description + ", dateSortie=" + dateSortie
				+ ", image=" + image + "]";
	}
	
	
	
	
	

}
