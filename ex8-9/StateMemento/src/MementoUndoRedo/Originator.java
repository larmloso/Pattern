

/*
Originator: Sets and Gets values from the currently targeted Memento. 
Creates new Mementos and assigns current values to them.
*/
public class Originator {

    private String article;

    // Sets the value for the article
    public void set(String newArticle) {
        System.out.println("> Originator.set('" + newArticle + "')");
        this.article = newArticle;
    }

    // Creates a new Memento with a new article
    public Memento storeInMemento() {
        System.out.println("> Originator.storeInMemento() : create new Memento('" + article + "')");
        return new Memento(article);
    }

    // Gets the article currently stored in memento
    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.println("> Originator.restoreFromMemento(): Memento.getSaveArticle() - '" + article + "'");
        return article;
    }

}
