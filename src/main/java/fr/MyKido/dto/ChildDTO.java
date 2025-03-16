package fr.MyKido.dto;

public class ChildDTO {
    private Integer id;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String allergies;
    private String notes;
    private Integer parentId;
    
    public ChildDTO(Integer id,String lastName, String firstName, String birthDate, String allergies, String notes) {
        this.id = id ;
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

    public Integer getParentId() {
        return parentId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
 
    

}
