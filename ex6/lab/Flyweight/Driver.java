
import java.util.Random;
public class Driver {
    String[] imgName = { "aaa.png", "bbb.png", "ccc.png" };

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 20; ++i) {
            MyImage rect = ImageFactory.getRect(getRandColor());
            rect.showInfo(getRandX(), getRandY());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    private int getRandX() {
        return (int) new Random().nextInt(10) + 2;
    }

    private int getRandY() {
        return (int) new Random().nextInt(10) + 2;
    }

    private String getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(2);
        return imgName[randInt];
    }
}
