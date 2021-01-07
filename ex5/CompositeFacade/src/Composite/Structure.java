
import java.util.ArrayList;
import java.util.List;

public class Structure implements Group {

    // Collection of child groups.
    int id;
    private List groups = new ArrayList();

    public Structure(int id) {
        this.id = id;
    }

    public void assemble() {
        System.out.print(" Structure id: " + id + " contains \n");
        for (Object group : groups) {
            Group g = (Group) group;            
            g.assemble();
        }
        System.out.print("  ");
    }

    // Adds the group to the structure.
    public void add(Group group) {
        groups.add(group);
        System.out.println("Structure id: " + id + " is added.");
    }

    // Removes the group from the structure.
    public void remove(Group group) {
        groups.remove(group);
    }
}
