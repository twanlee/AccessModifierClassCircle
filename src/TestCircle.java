public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle("Blue");
        System.out.println(circle1.getColor());
        System.out.println(circle2.getColor());
    }
}
