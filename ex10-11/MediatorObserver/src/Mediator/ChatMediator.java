package Mediator;

public interface ChatMediator {    
    void addUser(User user);
    public void sendMessage(String msg, User user);        
    public void sendTo(String msg, User user);
}
