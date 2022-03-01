package T5.Q1;

import java.util.Date;

public class GeometricObject {
    private String color;
    private Boolean filled;
    private Date dateCreated;

    public GeometricObject(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public GeometricObject() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        Date date = new Date();
        return "Created on "+date+"\ncolor: "+color+" and filled: "+filled;
    }
}
