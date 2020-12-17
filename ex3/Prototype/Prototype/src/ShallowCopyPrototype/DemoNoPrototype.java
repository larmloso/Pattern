

public class DemoNoPrototype {
    public static void main(String[] args) {
        Person person1 = new Person("Kankrao");
        System.out.println("person 1:" + person1);
        Person person2 = person1;
        System.out.println("person 2:" + person2);

        Animal animal1 = new Animal("Wooof!");
        System.out.println("animal 1:" + animal1);
        Animal animal2 = animal1;
        System.out.println("animal 2:" + animal2);
    }
}
