import java.util.ArrayList;

public class Caretaker {
    
    ArrayList<Memento> saveArticles = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        saveArticles.add(m);
    }

    public Memento getMemento(int index) {
        return saveArticles.get(index);
    }
}