package fr.MyKido.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.security.models.Parent;

public interface ParentRepository  extends JpaRepository<Parent,Integer> {

}
