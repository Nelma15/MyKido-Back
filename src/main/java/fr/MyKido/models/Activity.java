package fr.MyKido.models;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    LocalDateTime activityTimeStart;
    LocalDateTime activityTimeEnd;
    private String activityName;
    private String activityDescription;
    private String activityType;    
    private byte[] photo;
    @ManyToOne
    private ChildEducatorEntity childEducator;

    public Activity() {
    }

    public Activity(Integer id, LocalDateTime activityTimeStart, LocalDateTime activityTimeEnd, String activityName, String activityDescription, String activityType, byte[] photo) {
        this.id = id;
        this.activityTimeStart = activityTimeStart;
        this.activityTimeEnd = activityTimeEnd;
        this.activityName = activityName;
        this.activityDescription = activityDescription;
        this.activityType = activityType;
        this.photo = photo;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    
    public LocalDateTime getActivityTimeStart() {
        return activityTimeStart;
    }


    public void setActivityTimeStart(LocalDateTime activityTimeStart) {
        this.activityTimeStart = activityTimeStart;
    }


    public LocalDateTime getActivityTimeEnd() {
        return activityTimeEnd;
    }


    public void setActivityTimeEnd(LocalDateTime activityTimeEnd) {
        this.activityTimeEnd = activityTimeEnd;
    }


    public String getActivityName() {
        return activityName;
    }


    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }


    public String getActivityDescription() {
        return activityDescription;
    }



    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }



    public String getActivityType() {
        return activityType;
    }



    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }



    public byte[] getPhoto() {
        return photo;
    }



    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}


