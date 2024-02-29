//Muhammad Haidar Matin
public class Square {
    private double width;
    private double height;

    // Constructor
    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Setter methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter methods
    public double getLuas() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
