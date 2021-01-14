
public class MyImage {

    private String filename;
    private int w, h;

    public MyImage(String filename){
        this.filename = filename;
    }

    public void showInfo(int w, int h) {
        System.out.println(filename + " size : " + w  + "px X " + h + "px");
    }

}