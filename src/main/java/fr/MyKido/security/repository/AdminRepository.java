package fr.MyKido.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.security.models.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity,Integer> {

}
