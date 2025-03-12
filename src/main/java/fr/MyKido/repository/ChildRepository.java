package fr.MyKido.repository;

import fr.MyKido.models.ChildEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<ChildEntity,Integer> {
     List<ChildEntity> findByParentId(Integer id);

}
