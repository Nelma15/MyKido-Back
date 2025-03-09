package fr.MyKido.repository;

import javax.swing.text.Document;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentsRepository extends JpaRepository<Document,Integer> {

}
