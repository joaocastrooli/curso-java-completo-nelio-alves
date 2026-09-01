package entities;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }


    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14 * (radius * radius);
    }
    
}
