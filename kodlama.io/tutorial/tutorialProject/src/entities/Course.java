package entities;

public class Course {
    private int id;
    private int unitPrice;
    private Category[] category;
    private String courseName;

    public Course(){

    }

    public  Course(int id,int unitPrice ,String courseName){
        this.id = id;
        this.unitPrice = unitPrice;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Category[] getCategory() {
        return category;
    }

    public void setCategory(Category[] category) {
        this.category = category;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
