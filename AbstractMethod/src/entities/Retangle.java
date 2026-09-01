package entities;

public class Retangle extends Shape {

    private double width;
    private double height;

    public Retangle() {
    }

    
    public Retangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double area(){
        return width * height;
    }
}
