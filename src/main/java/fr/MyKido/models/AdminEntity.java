package fr.MyKido.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@DiscriminatorValue("ADMIN")
public class AdminEntity extends UserEntity {
    private String levelAccess;
    private LocalDateTime lastLogin;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Bill> bills;
    @OneToOne
    private HolidaySchedule holidaySchedule;

    public AdminEntity() {
    }

    public AdminEntity(String levelAccess, LocalDateTime lastLogin, List<Bill> bills, HolidaySchedule holidaySchedule) {
        this.levelAccess = levelAccess;
        this.lastLogin = lastLogin;
        this.bills = bills;
        this.holidaySchedule = holidaySchedule;
    }

    public String getLevelAccess() {
        return levelAccess;
    }

    public void setLevelAccess(String levelAccess) {
        this.levelAccess = levelAccess;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public HolidaySchedule getHolidaySchedule() {
        return holidaySchedule;
    }

    public void setHolidaySchedule(HolidaySchedule holidaySchedule) {
        this.holidaySchedule = holidaySchedule;
    }

    
}
