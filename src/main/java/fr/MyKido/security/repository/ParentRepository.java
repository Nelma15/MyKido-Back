package fr.MyKido.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.security.models.ParentEntity;

public interface ParentRepository  extends JpaRepository<ParentEntity,Integer> {

}
