package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.Bill;

public interface BillRepository extends JpaRepository<Bill,Integer> {

}
