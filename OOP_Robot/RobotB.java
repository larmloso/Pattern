class RobotB extends Robot {


    RobotB(String name, String id){
        this(name, id, "run...");
    }

    RobotB(String name, String id, String start){
        this.number += 1;
        this.name = name;
        this.id = id;
    }


    public void display(){
        System.out.println("robit number " + number);
        System.out.println("name : " + name);
        System.out.println("id : " + id);

    }

    

    
    public void walk(){
        System.out.println("wark...");
    }

    public void turnLeft(){
        System.out.println("turnLeft...");
    }

    public void turnRight(){
        System.out.println("turnRight...");
    }

    public void stop(){
        System.out.println("stop...");
    }





}