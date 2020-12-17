public class DemoSingleton {

    public static void main(String[] args) {
        // Cannot new Singleton like this
        //SocketConnector sc = new SocketConnector();
        SocketConnector.getInstance().connect();
        System.out.println("SocketConnector hasCode = " + SocketConnector.getInstance().hashCode());
        SocketConnector.getInstance().doSomething();
        System.out.println("SocketConnector hasCode = " + SocketConnector.getInstance().hashCode());
        
        // test class Thing
        //
        Thing.getInstance().doing();
        System.out.println(Thing.getInstance().hashCode());
        
        Thing.getInstance().singing();
        System.out.println(Thing.getInstance().hashCode());
    }
}
