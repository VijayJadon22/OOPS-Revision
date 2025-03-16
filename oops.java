// class Pen {
//     String color;
//     String type; // ballpoint pen, gel pen

//     // void pen(String color, String type){
//     // this.color = color;
//     // this.type = type;
//     // }

//     public void write() {
//         System.out.println("Writing something");
//     }

//     void printDetails() {
//         System.out.println("Pen Details are: " + "color is: " + this.color + " type is: " + this.type);
//     }

// }

///////////Polymorphism

// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println(name + " " + age);
//     }

//     // Non paramterized constructor
//     Student() {
//         System.out.println("Student constructor invoked");
//     }

//     // // Paramterized constructor
//     // Student(String name, int age) {
//     // System.out.println("inside Paramterized constructor");
//     // this.name = name;
//     // this.age = age;
//     // }

//     Student(Student s) {
//         System.out.println("Inside Copy constructor");
//         this.name = s.name;
//         this.age = s.age;
//     }

//     public void printInfo() {
//         System.out.println("Name is: " + this.name);
//         System.out.println("Age is: " + this.age);
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         // Student s1 = new Student("Vijay", 26);
//         Student s1 = new Student();
//         s1.name = "Aman";
//         s1.age = 26;
//         s1.printInfo(s1.age);
//         s1.printInfo(s1.name);
//         s1.printInfo(s1.name, s1.age);
//     }
// }

// ////Inheritance

// //parent class
// class Shape {
//     String color;

//     void printColor() {
//         System.out.println(this.color);
//     }
// }

// //child class inheriting parent shape class
// class Triangle extends Shape {
//     // Triangle() {
//     //     super();

//     // }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "Red";
//         t1.printColor();
//     }
// }

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Oops {
    public static void main(String[] args) {

    }
}