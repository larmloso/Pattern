public class DemoEmployees {

    public static void main(String[] args) {
        Employees employees = new WarningEmployee();
        try {
            employees.conductReport("mr.chaiwat");
            employees.conductReport("mr.topson");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}