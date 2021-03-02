

import java.util.ArrayList;

/*
Caretaker: Holds an ArrayList that contains all previous versions of the Memento. 
It can store and retrieve stored Mementos.
*/
public class Caretaker {
    
    ArrayList<Memento> savedArticles = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }


}
