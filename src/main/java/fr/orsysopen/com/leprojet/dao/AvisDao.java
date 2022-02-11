package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsysopen.com.leprojet.business.Avis;

public interface AvisDao extends JpaRepository<Avis, Long> {

}
