public class Rectangle implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    public void calculate(Shape request) {
        if (request.getCalcWanted() == "Rect") {
            System.out.println(request.getWidth() + " x " + request.getHeight() + " = "
                    + (request.getWidth() * request.getHeight()));
        } else {
            System.out.println("..calling from Rectangle");
            nextInChain.calculate(request);
        }
    }
}