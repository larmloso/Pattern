

public class DOCfile extends File {

    @Override
    void openfile() {
        System.out.println("DOC openfile");
    }

    @Override
    void readfile() {
        System.out.println("DOC readfile");
    }

    @Override
    void editfile() {
        System.out.println("DOC editfile");
    }

    @Override
    void savefile() {
        System.out.println("DOC savefile");
    }

    @Override
    void closefile() {
        System.out.println("DOC closefile");
    }


}
