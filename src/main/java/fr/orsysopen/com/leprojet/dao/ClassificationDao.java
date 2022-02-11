package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsysopen.com.leprojet.business.Classification;

public interface ClassificationDao extends JpaRepository<Classification, Long> {

}
