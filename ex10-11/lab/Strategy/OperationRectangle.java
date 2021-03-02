public class OperationRectangle implements Strategy {

    @Override
    public double doOperation(double num1, double num2) {
        return (num1 * num2);
    }
}