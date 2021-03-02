class AirConditioner implements ElectronicDevice {

    private int volume = 0;

    public void on() {
        System.out.println("Air Conditiner on");
    }

    public void off() {
        System.out.println("Air Conditiner off");
    }

    public void setvolume(int volume){
        this.volume = volume;
        System.out.println("Air Conditiner is Set Volume at:" +  volume);
    }

    public void volumeUp() {
        volume++;
        System.out.println("Air Conditiner Volume is at: " + volume);
    }

    public void volumenDown() {
        volume--;
        System.out.println("Air Conditiner Volume is at: " + volume);
    }
}