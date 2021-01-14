
import java.util.Random;
public class Driver {
    String[] fileImgName = { "aaa.png", "bbb.png", "ccc.png"};

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {

        // int e = 0;
        // while (e <= 10){

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 200; ++i) {
                MyImage image = ImageFactory.getImage(getRandImage());
                image.showInfo(getWidth(), getHeight());
            }
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");

        //     ++e;
        // }
    }

    private int getWidth() {
        return (int) new Random().nextInt(10) + 2;
    }

    private int getHeight() {
        return (int) new Random().nextInt(10) + 2;
    }

    private String getRandImage() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(3);
        return fileImgName[randInt];
    }
}
