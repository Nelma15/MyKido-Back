package fr.MyKido.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Integer> {
    List<Activity> findByChildId(Integer childId);

}
