import java.util.ArrayList;
import java.util.List;

public class Structure implements Group {

    int id;
    private List groups = new ArrayList();

    public Structure(int id){
        this.id = id;
    }

    public void assemble() {
        System.out.println(" Structure id: " + id + " contains");
        for (Object group : groups) {
            Group g = (Group) group;            
            g.assemble();
        }
    }

    public void add(Group group) {
        groups.add(group);
        System.out.println("Structure id: " + id + " is added.");
    }

}