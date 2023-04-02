class Shape {
    protected String name;

    public Shape() {
        this.name = "Shape";
    }

    public String printName(){
        return name;
    }
}
public class ShapeTest{
    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println(shape.printName());
        Circle circle = new Circle();
        System.out.println(circle.printName());
        Quad quad = new Quad();
        System.out.println(quad.printName());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.printName());
        Hexagon hexagon = new Hexagon();
        System.out.println(hexagon.printName());
        Triangle triangle = new Triangle();
        System.out.println(triangle.printName());
    }
}
