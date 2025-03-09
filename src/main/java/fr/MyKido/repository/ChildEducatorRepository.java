package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.ChildEducatorEntity;

public interface ChildEducatorRepository  extends JpaRepository<ChildEducatorEntity,Integer> {

}
