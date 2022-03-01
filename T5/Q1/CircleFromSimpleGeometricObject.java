package T5.Q1;

public class CircleFromSimpleGeometricObject extends GeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius) {
        super("white",false);
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*Math.PI*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
}
