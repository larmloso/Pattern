package Mediator;

import java.util.List;
import java.util.ArrayList;

public class VideoCallImpl implements VideoCall {

    private List<User> users;

    public VideoCallImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void call(String vc, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(vc);
            }
        }
    }
    
    @Override
    public void callTo(String vc, User user){
        for(User u : this.users){
            if(u == user){
                u.receive(vc);
            }
        }
    }

}
