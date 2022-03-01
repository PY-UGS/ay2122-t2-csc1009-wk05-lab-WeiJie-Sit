package T5.Q2;

public class Square extends Shape {
    public Square(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Square");
        return this.getDim1()*this.getDim2();
    }
}
