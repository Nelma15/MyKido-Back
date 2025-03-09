package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.MyKido.models.DailyReport;

public interface DailyReportRepository extends JpaRepository<DailyReport,Integer> {

}
