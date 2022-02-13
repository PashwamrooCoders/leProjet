package fr.orsysopen.com.leprojet.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ModeleEconomique {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	

	@OneToMany(mappedBy = "modelEco")
	private List<Jeu> jeux;
	
	public ModeleEconomique(String nom) {
		this.nom = nom;
	}
	public ModeleEconomique() {
		
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
	@Override
	public String toString() {
		return "ModeleEconomique [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
