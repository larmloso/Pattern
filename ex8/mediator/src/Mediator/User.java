package Mediator;

public abstract class User {

    protected VideoCall mediator;
    protected String name;

    public User(VideoCall med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void call(String vc);
    public abstract void callTo(String vc, User user);
    public abstract void receive(String vc);
}
