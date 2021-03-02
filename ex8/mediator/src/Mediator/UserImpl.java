package Mediator;

public class UserImpl extends User {

    public UserImpl(VideoCall med, String name) {
        super(med, name);
    }

    @Override
    public void call(String vc) {
        System.out.println(this.name + ": Calling = " + vc);
        mediator.call(vc, this);
    }
    
    @Override
    public void callTo(String vc, User user) {
        System.out.println(this.name + ": Calling = " + vc);
        mediator.callTo(vc, user);
    }

    @Override
    public void receive(String vc) {
        System.out.println(this.name + ": Received Video Call:" + vc);
    }

}
