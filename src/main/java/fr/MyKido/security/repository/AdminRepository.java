package fr.MyKido.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.security.models.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
