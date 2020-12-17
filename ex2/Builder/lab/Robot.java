public class Robot {

    private String name, id;
    private int level;
    private boolean isAutomaticWork = false;
    private boolean isTalk = false;

    private Robot(RobotBuilder builder){
        this.name = builder.name;
        this.id = builder.id;
        this.isAutomaticWork = builder.isAutomaticWork;
        this.isTalk = builder.isTalk;
        this.level = builder.level;
    }

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getLevel(){
        return level;
    }


    public void showInfo(){
        System.out.println("NAME :"+ name + "\nID : " + id + "\nAutomatic Work : "+ isAutomaticWork);
        System.out.println("Automatic Talk : " + isTalk + "\n" + "Level : " + level + "\n");
    }


    public static class RobotBuilder {
        private String name,id;
        private int level;
        private boolean isAutomaticWork = false;
        private boolean isTalk = false;

        public RobotBuilder(String name, String id){
            this.name = name;
            this.id = id;
        }
        public RobotBuilder(String name, String id, int level){
            this.name = name;
            this.id = id;
            this.level = level;
        }

        public RobotBuilder setAutomaticWork(boolean isAutomaticWork){
            this.isAutomaticWork = isAutomaticWork;
            return this;
        }

        public RobotBuilder setTalk(boolean isTalk){
            this.isTalk = isTalk;
            return this;
        }

        public Robot build(){
            return new Robot(this);
        }
    }

}