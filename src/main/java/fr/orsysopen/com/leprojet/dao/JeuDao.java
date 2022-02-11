package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsysopen.com.leprojet.business.Jeu;

public interface JeuDao extends JpaRepository<Jeu, Long> {

}
