class Driver {
    public static void main(String[] args) {
        Robot dogrobot = new Robot.RobotBuilder("dogName", "dogBrand", 1800.00).setBLsing(true).build();
        dogrobot.showInfo();

        Robot catrobot = new Robot.RobotBuilder("CatName", "catBrand", 2000).build();
        catrobot.showInfo();
    }
}

