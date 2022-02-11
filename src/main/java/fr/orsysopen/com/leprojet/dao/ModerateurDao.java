package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsysopen.com.leprojet.business.Moderateur;

public interface ModerateurDao extends JpaRepository<Moderateur, Long> {

}
