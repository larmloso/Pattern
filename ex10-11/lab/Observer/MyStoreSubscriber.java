

public class MyStoreSubscriber implements Observer {

    private String name;
    private Subject store;

    public MyStoreSubscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update() {
        String msg = (String) store.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.store = sub;
    }

}
