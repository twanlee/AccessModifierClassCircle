public class Circle {
    private String color = "Red";
    private double radius = 1.0;
    Circle(){};
    Circle(String c){
        this.color= c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
