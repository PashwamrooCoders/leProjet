package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsysopen.com.leprojet.business.Plateforme;

public interface PlateformeDao extends JpaRepository<Plateforme, Long> {

}
