package fr.MyKido.repository;

import fr.MyKido.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity,Integer> {
    List<Activity> findByChildId(Integer childId);

}
