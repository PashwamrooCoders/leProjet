package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsysopen.com.leprojet.business.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
