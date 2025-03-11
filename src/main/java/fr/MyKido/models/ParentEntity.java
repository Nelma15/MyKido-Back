package fr.MyKido.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue("PARENT")
public class ParentEntity extends UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private Adress adress;
    @OneToMany(mappedBy = "parent",cascade = CascadeType.ALL) 
    private List<ChildEntity> children;
    @OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
    private List<Bill> bills;
  

     
    public ParentEntity() {
    }

    public ParentEntity(Integer id, Adress adress, List<ChildEntity> children, List<Bill> bills) {
        this.id = id;
        this.adress = adress;
        this.children = children;
        this.bills = bills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<ChildEntity> getChildren() {
        return children;
    }

    public void setChildren(List<ChildEntity> children) {
        this.children = children;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

}
