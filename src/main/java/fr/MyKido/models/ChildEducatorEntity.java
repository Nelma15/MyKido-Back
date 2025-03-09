package fr.MyKido.models;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("CHILDEDUCATOR")
public class ChildEducatorEntity extends UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String qualification;
    @OneToMany(mappedBy = "childEducator", cascade = CascadeType.ALL)
    private List<Activity> activities;
    @OneToMany(mappedBy = "childEducator", cascade = CascadeType.ALL)
    private List<DailyReport> dailyReports;

    public ChildEducatorEntity() {
    }

    public ChildEducatorEntity(Integer id, String qualification) {
        this.id = id;
        this.qualification = qualification;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    

}
