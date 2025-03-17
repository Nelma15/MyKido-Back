package fr.MyKido.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("CHILDEDUCATOR")
public class ChildEducatorEntity extends UserEntity {
    @OneToMany(mappedBy = "childEducator", cascade = CascadeType.ALL)
    private List<Activity> activities;

    public ChildEducatorEntity() {
    }

    public ChildEducatorEntity(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }


    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

}
