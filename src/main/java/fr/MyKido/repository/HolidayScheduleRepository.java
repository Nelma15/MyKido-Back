package fr.MyKido.repository;

import fr.MyKido.models.HolidaySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayScheduleRepository extends JpaRepository<HolidaySchedule,Integer>{

}