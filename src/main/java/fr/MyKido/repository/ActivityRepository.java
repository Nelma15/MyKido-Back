package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Integer> {

}
