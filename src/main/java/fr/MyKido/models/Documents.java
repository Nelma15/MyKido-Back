package fr.MyKido.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Documents {
    @Id
    private Integer id;
    private String name;
    private String type;
    private byte[] data;
    private String description;
    @ManyToOne
    private ChildEntity child;

    public Documents() {
    }

    public Documents(Integer id, String name, String type, byte[] data, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.data = data;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}