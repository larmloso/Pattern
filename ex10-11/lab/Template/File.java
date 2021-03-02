public abstract class File {

    abstract void openfile();

    abstract void readfile();

    abstract void editfile();

    abstract void savefile();

    abstract void closefile();

    //template method is FINAL
    public final void startfile() {
        openfile();
        readfile();
        editfile();
        savefile();
        closefile();
    }
}