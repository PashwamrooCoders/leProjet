package fr.orsysopen.com.leprojet.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String pseudo;
	private String motDePasse;
	@Email
	private String email;
	
	
	public Utilisateur() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", email=" + email + "]";
	}
	
	


	
}
