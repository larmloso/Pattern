

public class PDFfile extends File {

    @Override
    void openfile() {
        System.out.println("PDF openfile");
    }

    @Override
    void readfile() {
        System.out.println("PDF readfile");
    }

    @Override
    void editfile() {
        System.out.println("PDF editfile");
    }

    @Override
    void savefile() {
        System.out.println("PDF savefile");
    }

    @Override
    void closefile() {
        System.out.println("PDF closefile");
    }


}
