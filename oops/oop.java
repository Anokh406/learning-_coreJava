package oops;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("write something here...");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // parameterized constructor
    // Student(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }
    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {
    }
}

public class oop {
    public static void main(String[] args) {
        Student s1 = new Student(); // student()-> constructor and new is a keyword
        s1.name = "Anokh";
        s1.age = 20;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
