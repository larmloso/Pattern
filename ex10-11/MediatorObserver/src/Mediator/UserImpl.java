package Mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }
    
    @Override
    public void sendTo(String msg, User user) {
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendTo(msg, user);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }

}
