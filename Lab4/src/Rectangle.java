public class Rectangle extends Shape{

    double height;
    double width;

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    double calculateCircumference() {
        return (2 * width)+(2 * height);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
