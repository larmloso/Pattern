package Mediator;

public interface VideoCall {    
    void addUser(User user);
    public void call(String vc, User user);        
    public void callTo(String vc, User user);
}
