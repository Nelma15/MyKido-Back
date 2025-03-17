package fr.MyKido.repository;

import fr.MyKido.models.ChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChildRepository extends JpaRepository<ChildEntity,Integer> {
     List<ChildEntity> findByParentId(Integer id);

}
