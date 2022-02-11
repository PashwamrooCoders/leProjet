package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsysopen.com.leprojet.business.Joueur;

public interface JoueurDao extends JpaRepository<Joueur, Long> {

	

}
