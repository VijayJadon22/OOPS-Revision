package src;

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(this.name + " is walking");
    }

    void walk(int speed) {
        System.out.println(this.name + " is walking at speed of: " + speed + " km/hr");
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Arun";
        p1.age = 12;
        System.out.println(p1);

        Person p2 = new Person();
        p2.name = "Anuj";
        p2.age = 20;
        // p1.walk();
        p1.walk(20);
        p2.eat();
    }
}
