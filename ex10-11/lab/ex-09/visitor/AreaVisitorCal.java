public class AreaVisitorCal implements AreaVisitor {

    @Override
    public int visit(Rectangle rectangle) {
        int rectanglearea = rectangle.getWidth() * rectangle.getLength();
        System.out.println("width = " + rectangle.getWidth() + ", length = " + rectangle.getLength() + " : Rectangle Area = " + rectanglearea);
        return rectanglearea;
    }

    @Override
    public int visit(Triangle triangle) {
        double trianglearea = 0.5 * ( triangle.getBase() * triangle.getHigh() );
        System.out.println("base = " + triangle.getBase() + ", high = " + triangle.getHigh() + " : Triangle Area = " +  trianglearea);
        int area = (int) Math.sqrt(trianglearea);
        return area;
    }
    
}