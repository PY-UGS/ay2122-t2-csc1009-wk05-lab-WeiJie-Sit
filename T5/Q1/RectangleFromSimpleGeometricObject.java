package T5.Q1;

import T5.Q1.GeometricObject;

public class RectangleFromSimpleGeometricObject extends GeometricObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(String color, Boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height) {
        super("white", false);
        this.width = width;
        this.height = height;
    }
    public RectangleFromSimpleGeometricObject() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*width+2*height;
    }
}
