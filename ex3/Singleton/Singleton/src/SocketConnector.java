public class SocketConnector {
    
    private static SocketConnector instance;
    private static int portNumber = 123;
    
    // Private constructor to restrict instantiation of the class from other classes.
    private SocketConnector(){}
    
    private static class SocketConnectorCreator{
        private static final SocketConnector _scc = new SocketConnector();
    }
    
    public static SocketConnector getInstance(){
        return SocketConnectorCreator._scc;
    }
    
    public void connect(){
        System.out.println("securely connecting .... at port: " + portNumber);
    }
    public void doSomething(){
        System.out.println("securely doing something ....");
    }
    
}
