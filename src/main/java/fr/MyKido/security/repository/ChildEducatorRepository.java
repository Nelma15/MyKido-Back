package fr.MyKido.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.security.models.ChildEducatorEntity;

public interface ChildEducatorRepository  extends JpaRepository<ChildEducatorEntity,Integer> {

}
