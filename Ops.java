class Shape {
    String name;

    public void printArea() {
        System.out.println("hello world");
    }

}

class Triangle extends Shape { // single level inheritance one base class and one derived class
    public void printAreas(int l, int h) {
        System.out.println(l * h);
    }
}

class Triangle_1 extends Triangle { // multi level inheritance multiple base class and multiple deriver class
}

class EquilateralTriangle extends Shape { // hierarchal inheritance single base class with multiple derived classes
}

public class Ops {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.printAreas(5, 5);
    }
}
