public class OperationTriangle implements Strategy {

    @Override
    public double doOperation(double width, double height) {
        return (0.5 * width * height);
    }
}