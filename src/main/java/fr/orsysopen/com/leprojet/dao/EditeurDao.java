package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsysopen.com.leprojet.business.Editeur;

public interface EditeurDao extends JpaRepository<Editeur, Long> {

}
