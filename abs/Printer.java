abstract class Printer implements Printerable{

    String brand;
    int id;
    
    public void print() {
        System.out.println("print");
    }

    public void cancel(){
        System.out.println("cancel");
    }
}