public class Driver {

    public static void main(String[] args) {
        Tshirt ts = new Tshirt(new RedColor(), new CottonFabricTexture());
        ts.applyColor();
        ts.applyFabricTexture();
    }
}