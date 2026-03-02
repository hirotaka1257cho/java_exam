package com.example.q8;

public class Stadiamdomain {

    private Integer id;
    private String name;
    private String establishedDate;
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
    public String getEstablishedDate() {
        return establishedDate;
    }
    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }
    @Override
    public String toString() {
        return "Stadiamdomain [id=" + id + ", name=" + name + ", establishedDate=" + establishedDate + "]";
    }

    
}
