abstract class Robot implements Robotable {

    protected static int number;
    protected String name, id;

    public Robot(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    public void display(){
        System.out.println("Robot name : "+ name);
        System.out.println("Robot id : " + id);
    }


    // interface class
    public void walk(){}
    public void turnLeft(){}
    public void turnRight(){}
    public void stop(){}




}