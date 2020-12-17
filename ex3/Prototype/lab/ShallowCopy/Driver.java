class Driver {
    public static void main(String[] args){
        CleaningRobot cln1 = new CleaningRobot("cleaning", "cln-007", 3, false);
        System.out.println("CleaningRobot 1 :" + cln1);
        CleaningRobot cln2 = (CleaningRobot) cln1.doClone();
        System.out.println("CleaningRobot 2 :" + cln2 +"\n");

        ServiceRobot srv1 = new ServiceRobot("server", "srv-001", true, false);
        System.out.println("ServiceRobot 1 :" + srv1);
        ServiceRobot srv2 = (ServiceRobot) srv1.doClone();
        System.out.println("ServiceRobot 2 :" + srv2); 


    }
}