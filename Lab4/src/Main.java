//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("============================ Circle ========================");
    Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        System.out.println("\n============================ Rectangle ========================");
    Rectangle rectangle = new Rectangle(30,20);
        System.out.println("Rectangle Area: "+ rectangle.calculateArea());
        System.out.println("Rectangle Circumference: "+ rectangle.calculateCircumference());

        System.out.println("\n============================ Triangle ========================");
    Triangle triangle = new Triangle(24, 43);
        System.out.println("Triangle Area: "+triangle.calculateArea());
        System.out.println("Triangle Circumference: "+triangle.calculateCircumference());
    }



}