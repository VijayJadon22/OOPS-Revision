class Pen {
    String color;
    String type; // ballpoint pen, gel pen

    // void pen(String color, String type){
    // this.color = color;
    // this.type = type;
    // }

    public void write() {
        System.out.println("Writing something");
    }

    void printDetails() {
        System.out.println("Pen Details are: " + "color is: " + this.color + " type is: " + this.type);
    }

}

class Student {
    String name;
    int age;

    // Non paramterized constructor
    Student() {
        System.out.println("Student constructor invoked");
    }

    // // Paramterized constructor
    // Student(String name, int age) {
    // System.out.println("inside Paramterized constructor");
    // this.name = name;
    // this.age = age;
    // }

    Student(Student s2) {
        System.out.println("Inside Copy constructor");
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo() {
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
    }
}

public class Oops {
    public static void main(String[] args) {
        // Student s1 = new Student("Vijay", 26);
        Student s2 = new Student();
        s2.name = "Aman";
        s2.age = 26;
        Student s1 = new Student(s2);
        s1.printInfo();
    }
}
