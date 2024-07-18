public class Circle extends Shape {

    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (radius * radius) * Math.PI;
    }

    @Override
    double calculateCircumference() {
        return Math.PI * 2 * radius;
    }
}
