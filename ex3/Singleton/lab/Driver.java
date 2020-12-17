public class Driver {

    public static void main(String[] args) {
        // Cannot new Singleton like this
        //SocketConnector sc = new SocketConnector();
        SocketConnector.getInstance().connect();
        System.out.println("SocketConnector hasCode = " + SocketConnector.getInstance().hashCode());
        SocketConnector.getInstance().doSomething();
        System.out.println("SocketConnector hasCode = " + SocketConnector.getInstance().hashCode() + "\n");
        
        // test class CleaningRobot
        CleaningRobot.getInstance().sweep();
        System.out.println("CleaningRobot hasCode : " + CleaningRobot.getInstance().hashCode());
        CleaningRobot.getInstance().mopping();
        System.out.println("CleaningRobot hasCode : " + CleaningRobot.getInstance().hashCode() + "\n");

        // test class ServiceRobot

        ServiceRobot.getInstance().serveFood();
        System.out.println("ServiceRobot hasCode : " + ServiceRobot.getInstance().hashCode());
        ServiceRobot.getInstance().talking();
        System.out.println("ServiceRobot hasCode : " + ServiceRobot.getInstance().hashCode());
    }
}
