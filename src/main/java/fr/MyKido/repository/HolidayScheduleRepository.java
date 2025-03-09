package fr.MyKido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.MyKido.models.HolidaySchedule;

public interface HolidayScheduleRepository extends JpaRepository<HolidaySchedule,Integer>{

}