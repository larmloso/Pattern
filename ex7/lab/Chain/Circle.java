public class Circle implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    public void calculate(Shape request) {
        if (request.getCalcWanted() == "Cir") {
            System.out.println("3.14" + " x " + request.getWidth() + " **2  = "
                    + (3.14 * (request.getWidth() * request.getWidth())));
        } else {
            System.out.println("..calling from Circle");
            nextInChain.calculate(request);
        }
    }
}