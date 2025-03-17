package fr.MyKido.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
@DiscriminatorValue("PARENT")
public class ParentEntity extends UserEntity{
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private Adress adress;
    @OneToMany(mappedBy = "parent",cascade = CascadeType.ALL) 
    private List<ChildEntity> children;
    @OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
    private List<Bill> bills;
  

     
    public ParentEntity() {
    }

    public ParentEntity(Adress adress, List<ChildEntity> children, List<Bill> bills) {
        this.adress = adress;
        this.children = children;
        this.bills = bills;
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
