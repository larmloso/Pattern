public class Thing {
    
    public static Thing getInstance(){
        return new Thing();
    }
    
    public void doing(){
        System.out.println("Thing is doing");
    }
    
    public void singing(){
        System.out.println("Thing is singing");
    }
    
}
