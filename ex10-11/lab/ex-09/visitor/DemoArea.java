public class DemoArea {
    
    public static void main (String[] args) {
        Area rectangle = new Rectangle(3, 5);
        rectangle.calculate(new AreaVisitorCal());

        Area triangle = new Triangle(5, 7);
        triangle.calculate(new AreaVisitorCal());
    }

}