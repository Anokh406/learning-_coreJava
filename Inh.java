
class Shape {
    String color;
}

class Triangles extends Shape {

}

public class Inh {
    public static void main(String[] args) {
        Triangles t = new Triangles();
        t.color = "blue";
        System.out.println(t);
    }
}
