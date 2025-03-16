package src;

class Person {
    String name;
    int age;
    static int count;

    Person() {
        Person.count++;
        System.out.println("inside constructor");
    }

    Person(String newName, int newAge) {
        // this(); //to invoke default constructor
        this.name = newName;
        this.age = newAge;
    }

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

class Developer extends Person {
    Developer(String name, int age) {
        super(name, age);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Arun";
        p1.age = 12;
        System.out.println(p1);

        Person p2 = new Person("Shivam", 24);
        // p1.walk();
        p1.walk(20);
        p2.eat();
        System.out.println(Person.count);
    }
}
