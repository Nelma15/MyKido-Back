package fr.MyKido.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.Documents;

public interface DocumentsRepository extends JpaRepository<Documents,Integer> {

}
