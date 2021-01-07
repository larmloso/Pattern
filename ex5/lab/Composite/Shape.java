public class Shape implements Group {
    
    String name;

    public Shape(String name){
        this.name = name;
    }

    public void assemble() {
        System.out.println("  * "+ this.name);
    }
}