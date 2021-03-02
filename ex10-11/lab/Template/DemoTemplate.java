public class DemoTemplate {

    public static void main(String[] args) {
        File file = new DOCfile();
        file.startfile();
        System.out.println();

        file = new PDFfile();
        file.startfile();
        System.out.println();

        file = new CSVfile();
        file.startfile();



    }
}