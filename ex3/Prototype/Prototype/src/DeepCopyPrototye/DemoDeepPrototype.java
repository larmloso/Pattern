
public class DemoDeepPrototype {

    public static void main(String[] args) {
        CloneMgr cm = new CloneMgr();
        cm.setNum(3);
        cm.setThing(new Thing("AAA"));
        System.out.println("Before cloning");
        System.out.println("clone mgr: " + cm); // call CloneMgr.toString()

        // do ShallowCopy & DeepCopy
        //
        CloneMgr shallowClone = cm.clone();
        CloneMgr deepClone = cm.deepClone();

        // change cm num & name
        cm.setNum(5);
        Thing thing = cm.getThing();
        thing.setName("BBB");

        System.out.println("\nAfter cloning");
        System.out.println("clone mgr :" + cm);
        System.out.println("shallowClone:" + shallowClone);
        System.out.println("deepClone:" + deepClone);

    }
}
