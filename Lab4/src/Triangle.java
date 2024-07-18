public class Triangle extends Shape{

    double height;
    double base;


    public Triangle(double height, double base){
        this.height=height;
        this.base=base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (0.5 * base) * height;
    }

    @Override
    double calculateCircumference() {
        return base * 3;
    }
}
