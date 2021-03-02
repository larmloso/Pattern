public class Shape {

    private double width, height;
    private String calculationWanted;

    public Shape(double width, double height, String calcWanted) {
        this.width = width;
        this.height = height;
        this.calculationWanted = calcWanted;
    }

    public Shape(double width, String calculate){
        this(width, 0, calculate);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getCalcWanted() {
        return calculationWanted;
    }
    
}