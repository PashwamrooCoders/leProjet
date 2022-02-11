package fr.orsysopen.com.leprojet.business;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Joueur extends Utilisateur {
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Past(message="La date de naissance doit être dans le passé")
	private LocalDate dateDeNaissance;

	public Joueur() {
		super();
		
	}

	public Joueur(LocalDate dateDeNaissance) {
		super();
		this.dateDeNaissance = dateDeNaissance;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	@Override
	public String toString() {
		return "Joueur [dateDeNaissance=" + dateDeNaissance + "]";
	}
	
	


}
