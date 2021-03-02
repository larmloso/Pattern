

public class AddNumbers implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    public void calculate(Numbers request) {
        if (request.getCalcWanted() == "add") {
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = "
                    + (request.getNumber1() + request.getNumber2()));
        } else {
            System.out.println("..calling from AddNumbers");
            nextInChain.calculate(request);
        }
    }
}
