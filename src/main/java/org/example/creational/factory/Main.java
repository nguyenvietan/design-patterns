package main.java.org.example.creational.factory;

public class Main {
    public Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("square")) {
            return new Square();
        } else if (type.equals("rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    public static void main(String[] args) {
        Main shapeFactory = new Main();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
