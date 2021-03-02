

public class DemoObserver {

    public static void main(String[] args) {
        
        //create subject
        MyStore store = new MyStore();

        //create observers
        Observer customer1 = new MyStoreSubscriber("Customer1");
        Observer customer2 = new MyStoreSubscriber("Customer2");
        Observer customer3 = new MyStoreSubscriber("Customer3");

        //register observers to the subject
        store.register(customer1);
        store.register(customer2);
        store.register(customer3);

        //attach observer to subject
        customer1.setSubject(store);
        customer2.setSubject(store);
        customer3.setSubject(store);

        //check if any update is available
        customer1.update();

        //now send message to subject
        store.postMessage("I have a new product.");
        customer1.update();
    }
}
