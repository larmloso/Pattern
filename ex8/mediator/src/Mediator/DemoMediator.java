package Mediator;

public class DemoMediator {

    public static void main(String[] args) {
        VideoCall mediator = new VideoCallImpl();
        User user1 = new UserImpl(mediator, "Wine");
        User user2 = new UserImpl(mediator, "Ram");
        User user3 = new UserImpl(mediator, "Few");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user2.callTo("Hi Bro! ", user3);
        System.out.println("========================================");

        user1.call("Hello Bro!");
        System.out.println("========================================");
        
        user2.callTo("Hi Bro! ", user1);

    }
}
