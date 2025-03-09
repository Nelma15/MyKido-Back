package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity,Integer> {

}
