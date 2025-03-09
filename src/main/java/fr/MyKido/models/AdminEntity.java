package fr.MyKido.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue("ADMIN")
public class AdminEntity extends UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String levelAccess;
    private LocalDateTime lastLogin;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Bill> bills;
    @OneToOne
    private HolidaySchedule holidaySchedule;

    public AdminEntity() {
    }

    public AdminEntity(Integer id, String levelAccess, LocalDateTime lastLogin) {
        this.id = id;
        this.levelAccess = levelAccess;
        this.lastLogin = lastLogin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
