

public class Animal implements Prototype{
    
    String sound;

    public Animal(String sound) {
            this.sound = sound;
    }

    @Override
    public Prototype doClone() {
            return new Animal(sound);
    }

    public String toString() {
            return "This animal says " + sound;
    }
    
}
