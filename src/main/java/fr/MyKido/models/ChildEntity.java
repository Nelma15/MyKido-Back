package fr.MyKido.models;


import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "children")
public class ChildEntity {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String allergies;
    private String notes;
   
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ParentEntity parent;
     
    @OneToMany(mappedBy = "child",cascade = CascadeType.ALL) 
    private List<Documents> documments;
    @OneToMany(mappedBy = "child",cascade = CascadeType.ALL) 
    private List<Activity> activities;

    public ChildEntity() {
    }

    public ChildEntity(Integer id, String lastName, String firstName, String birthDate, String allergies, String notes) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.allergies = allergies;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ParentEntity getParent() {
        return parent;
    }

    public void setParent(ParentEntity parent) {
        this.parent = parent;
    }

    public List<Documents> getDocumments() {
        return documments;
    }

    public void setDocumments(List<Documents> documments) {
        this.documments = documments;
    }

}






