public class Triangle implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    public void calculate(Shape request) {
        if (request.getCalcWanted() == "Tri") {
            System.out.println("1/2" + " x " + request.getWidth() + " x " + request.getHeight() + " = "
                    + (0.5 * request.getWidth() * request.getHeight()));
        } else {
            System.out.println("..calling from Triangle");
            nextInChain.calculate(request);
        }
    }
}