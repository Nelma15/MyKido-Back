package fr.MyKido.repository;


import fr.MyKido.models.Documents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentsRepository extends JpaRepository<Documents,Integer> {

}
