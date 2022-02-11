package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsysopen.com.leprojet.business.ModeleEconomique;

public interface ModeleEconomiqueDao extends JpaRepository<ModeleEconomique, Long> {

}
