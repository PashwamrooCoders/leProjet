package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsysopen.com.leprojet.business.Review;

public interface AvisDao extends JpaRepository<Review, Long> {

}
