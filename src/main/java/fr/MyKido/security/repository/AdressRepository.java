package fr.MyKido.security.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.security.models.Adress;
public interface AdressRepository  extends JpaRepository<Adress,Integer> {

}
