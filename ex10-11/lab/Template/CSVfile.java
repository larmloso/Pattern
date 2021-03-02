

public class CSVfile extends File {

    @Override
    void openfile() {
        System.out.println("CSV openfile");
    }

    @Override
    void readfile() {
        System.out.println("CSV readfile");
    }

    @Override
    void editfile() {
        System.out.println("CSV editfile");
    }

    @Override
    void savefile() {
        System.out.println("CSV savefile");
    }

    @Override
    void closefile() {
        System.out.println("CSV closefile");
    }


}
