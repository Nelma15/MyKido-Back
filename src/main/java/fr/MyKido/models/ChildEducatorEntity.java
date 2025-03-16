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
    @OneToMany(mappedBy = "childEducator", cascade = CascadeType.ALL)
    private List<Activity> activities;



    public ChildEducatorEntity() {
    }

    public ChildEducatorEntity(Integer id, String qualification, List<Activity> activities) {
        this.id = id;
        this.activities = activities;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    


    public List<Activity> getActivities() {
        return activities;
    }


    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

}
