class DemoChain {
    public static void main(String[] args){

        Chain chainCalc1 = new Rectangle();
        Chain chainCalc2 = new Circle();
        Chain chainCalc3 = new Triangle();
        
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);

        Shape request = new Shape(4, 5, "Tri");
        chainCalc1.calculate(request);
    }
}