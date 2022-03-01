package T5.Q2;

public class Triangle extends Shape {
    public Triangle(double base,double height){
        super(base,height);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Triangle");
        return this.getDim1() * this.getDim2()  / 2;
    }
}
