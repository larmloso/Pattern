
import java.util.List;
import java.util.ArrayList;

public class WarningEmployee implements Employees {

    private Employees employees = new NiceEmployees();
    private static List<String> blacklist;

    static {
        blacklist = new ArrayList<String>();
        blacklist.add("mr.ana");
        blacklist.add("mr.nisha");
        blacklist.add("mr.topson");
    }

    @Override
    public void conductReport(String listname) throws Exception {
        if (blacklist.contains(listname.toLowerCase())) {
            throw new Exception(listname + " has bad behavior.");
        }

        employees.conductReport(listname);
    }
}

