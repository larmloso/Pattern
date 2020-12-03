public class Robot {

    private String name, brand;
    private double price;
    private boolean BLsing = false;

    private Robot(RobotBuilder builder){
        this.name = builder.name;
        this.brand = builder.brand;
        this.price = builder.price;
        this.BLsing = builder.BLsing;
    }

    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public boolean getSing(){
        return BLsing;
    }


    public void showInfo(){
        System.out.println(this.name + ", " + this.brand + ", " + this.price );
        System.out.println("Robot can sing : " + this.BLsing + "\n");
    }


    public static class RobotBuilder {
        private String name, brand;
        private double price;
        private boolean BLsing = false;

        public RobotBuilder(String name, String brand, double price){
            this.name = name;
            this.brand = brand;
            this.price = price;
        }

        public RobotBuilder setBLsing(boolean blsing){
            this.BLsing = blsing;
            return this;
        }

        public Robot build(){
            return new Robot(this);
        }
    }

}