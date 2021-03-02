public class DemoStrategy {

    public static void main(String[] args) {
        Context context = new Context(new OperationRectangle());
        System.out.println("Ractangle : " + context.executeStrategy(20, 10) + "  cm**2");

        context = new Context(new OperationTriangle());
        System.out.println("Triangle : " + context.executeStrategy(20, 10) + "  cm**2");

    }
    
}