public class Memento {

    private static int mementoNoRunning = 0;
    private int mementoNo;
    private String article;

    public Memento(String articleSave) {
        mementoNoRunning++;
        mementoNo = mementoNoRunning;
        System.out.println("... new Memento('" + articleSave + "') No: " + mementoNo);        
        article = articleSave;
    }

    public String getSavedArticle() {
        System.out.println("... Memento.getSavedArticle() No: " + mementoNo);
        return article;
    }



}