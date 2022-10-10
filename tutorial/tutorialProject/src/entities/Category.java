package entities;

import java.util.List;

public class Category {
    private int id;
    private String name;
    private String catagoryName;

    public Category(){

    }
    public Category(int id,String catagoryName){
        this.id = id;
        this.catagoryName = catagoryName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }
}
