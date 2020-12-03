

public class DemoBuilder {

    public static void main(String[] args) {
        Mobile m1 = new Mobile.Builder("Asus", 3000).build();
        Mobile m2 = new Mobile.Builder("Samsung", 5000).setBLE(true).build();        
    }
}
