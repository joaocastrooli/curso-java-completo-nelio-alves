import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        for (int i=1; i<=shapes; i++){
            System.out.println("Shape #" + i + " data:");

            System.out.print("Retangle or Circle (r/c)? ");
            String shapeType = sc.next();

            if (shapeType.equalsIgnoreCase("r") ) {
                System.out.println("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());

                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Heigth: ");
                double height = sc.nextDouble();

                Shape r = new Retangle(color, width, height);
                list.add(r);
            }

            if (shapeType.equalsIgnoreCase("C")){
                System.out.println("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape c = new Circle(color, radius);
                list.add(c);
            }
        }

        sc.close();

        System.out.println("\nSHAPE AREAS:");
            for (Shape shape : list) {
                System.out.println(shape.area());
            }
        
    }
}
