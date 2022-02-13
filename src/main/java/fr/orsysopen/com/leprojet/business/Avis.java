package fr.orsysopen.com.leprojet.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Positive;

@Entity
public class Avis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Lob
	private String description;
	private LocalDateTime dateEnvoi;
	@Positive
	private Float note;
	
	private LocalDateTime dateModeration;
	
	// Plusieurs avis peuvent etre rattaché à un joueur
	@ManyToOne
	private Joueur joueur;
	
	// Un avis sera attaché à un moderateur
	@OneToOne
	private Moderateur moderateur;
	
	// Plusieurs avis peuvent etre rattaché à un jeu
	@ManyToOne
	private Jeu jeu;
	
	
	public Avis() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(LocalDateTime dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public Float getNote() {
		return note;
	}
	public void setNote(Float note) {
		this.note = note;
	}
	public LocalDateTime getDateModeration() {
		return dateModeration;
	}
	public void setDateModeration(LocalDateTime dateModeration) {
		this.dateModeration = dateModeration;
	}
	@Override
	public String toString() {
		return "Avis [id=" + id + ", description=" + description + ", dateEnvoi=" + dateEnvoi + ", note=" + note
				+ ", dateModeration=" + dateModeration + "]";
	}
	
	

}
