package fr.MyKido.models;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    LocalDateTime reportTime;
    @ManyToOne
    private ChildEducatorEntity childEducator;

    public DailyReport() {
    }

    public DailyReport(Integer id, LocalDateTime reportTime, ChildEducatorEntity childEducator) {
        this.id = id;
        this.reportTime = reportTime;
        this.childEducator = childEducator;
    }

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getReportTime() {
        return reportTime;
    }
    public void setReportTime(LocalDateTime reportTime) {
        this.reportTime = reportTime;
    }
    public ChildEducatorEntity getChildEducator() {
        return childEducator;
    }
    public void setChildEducator(ChildEducatorEntity childEducator) {
        this.childEducator = childEducator;
    }

}
