package fr.MyKido.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.Adress;
public interface AdressRepository  extends JpaRepository<Adress,Integer> {

}
