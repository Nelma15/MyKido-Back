package fr.MyKido.repository;

import fr.MyKido.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

   Optional<UserEntity> findByEmail(String email);
   Boolean existsByEmail(String email);

}
