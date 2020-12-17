
public class Driver {

    public static void main(String[] args) {
        CloneMgr cm = new CloneMgr();
        cm.setNum(4);
        cm.setCleaningRobot(new CleaningRobot("cleaning AAA", 1, true));
        System.out.println("Before cloning");
        System.out.println("clone Mgr: " + cm); // call CloneMgr.toString()

        // do ShallowCopy & DeepCopy
        //
        CloneMgr shallowClone = cm.clone();
        CloneMgr deepClone = cm.deepClone();

        // change cm num & name
        cm.setNum(5);
        CleaningRobot cln = cm.getCleaningRobot();
        cln.setName("cleaning BBB");
        cln.setIsAutoWork(false);

        System.out.println("\nAfter cloning");
        System.out.println("clone mgr :" + cm);
        System.out.println("shallowClone:" + shallowClone);
        System.out.println("deepClone:" + deepClone);




        // CloneMgr cm = new CloneMgr();
        // cm.setNum(4);
        // cm.setServiceRobot(new ServiceRobot("service AAA", false, true));
        // System.out.println("Before cloning");
        // System.out.println("clone Mgr: " + cm); // call CloneMgr.toString()

        // // do ShallowCopy & DeepCopy
        // //
        // CloneMgr shallowClone = cm.clone();
        // CloneMgr deepClone = cm.deepClone();

        // // change cm num & name
        // cm.setNum(5);
        // ServiceRobot srv = cm.getServiceRobot();
        // srv.setName("service BBB");

        // System.out.println("\nAfter cloning");
        // System.out.println("clone mgr :" + cm);
        // System.out.println("shallowClone:" + shallowClone);
        // System.out.println("deepClone:" + deepClone);

    }
}
