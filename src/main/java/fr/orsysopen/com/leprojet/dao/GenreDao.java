package fr.orsysopen.com.leprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsysopen.com.leprojet.business.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
