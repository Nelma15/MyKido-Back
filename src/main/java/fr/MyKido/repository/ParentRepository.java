package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.ParentEntity;

public interface ParentRepository  extends JpaRepository<ParentEntity,Integer> {

}
