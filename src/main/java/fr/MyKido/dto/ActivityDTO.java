package fr.MyKido.dto;

import java.time.LocalDateTime;

public class ActivityDTO {
    LocalDateTime activityTimeStart;
    LocalDateTime activityTimeEnd;
    private String activityName;
    private String activityDescription;
    private String activityType;    
    private byte[] photo;
    Integer childId;
        
    public ActivityDTO() {
    }

    public ActivityDTO(LocalDateTime activityTimeStart, LocalDateTime activityTimeEnd, String activityName,
            String activityDescription, String activityType, byte[] photo, Integer childId) {
        this.activityTimeStart = activityTimeStart;
        this.activityTimeEnd = activityTimeEnd;
        this.activityName = activityName;
        this.activityDescription = activityDescription;
        this.activityType = activityType;
        this.photo = photo;
        this.childId = childId;
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

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

 
}

