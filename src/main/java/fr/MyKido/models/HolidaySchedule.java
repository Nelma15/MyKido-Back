package fr.MyKido.models;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class HolidaySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate holidayStart;
    private LocalDate holidayEnd; 
    @OneToOne 
    private AdminEntity admin;

    public HolidaySchedule() {
    }

    public HolidaySchedule(Integer id, LocalDate holidayStart, LocalDate holidayEnd) {
        this.id = id;
        this.holidayStart = holidayStart;
        this.holidayEnd = holidayEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getHolidayStart() {
        return holidayStart;
    }

    public void setHolidayStart(LocalDate holidayStart) {
        this.holidayStart = holidayStart;
    }

    public LocalDate getHolidayEnd() {
        return holidayEnd;
    }

    public void setHolidayEnd(LocalDate holidayEnd) {
        this.holidayEnd = holidayEnd;
    }



}
