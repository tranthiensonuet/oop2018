package week5_6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, 3.0, 2.0, "red", true);
        Circle circle1 = new Circle(2.0, 3.0, 2.0);
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(1.0, 2.0, 3.0, 2.0, "green", false);
        Square square = new Square(2.0, 2.0, 2.0);
        Square square1 = new Square(3.0, 2.0, 2.0, "gray", true);
        Triangle triangle = new Triangle(new Point(3.0, 2.0), new Point(3.0, 2.0), new Point(3.0, 2.0));
        Triangle triangle1 = new Triangle(new Point(2.0, 1.0), new Point(2.0, 1.0), new Point(2.0, 1.0), "blue", true);
        Hexagon hexagon = new Hexagon();
        Hexagon hexagon1 = new Hexagon();
        Layer layer = new Layer();
        Diagram diagram = new Diagram();

        layer.getLayer().add(rectangle1);
        layer.getLayer().add(hexagon);
        layer.getLayer().add(triangle1);
        layer.getLayer().add(hexagon1);
        layer.getLayer().add(circle1);
        layer.getLayer().add(square1);
        layer.getLayer().add(triangle);
        layer.getLayer().add(circle);
        layer.getLayer().add(rectangle);
        layer.getLayer().add(square);

        System.out.println("Danh sach truoc khi xoa la:");
        System.out.println("---------------------------------");

        layer.printLayer();
        //layer.removeTriangle();
        layer.revomeDuplicated();
        //layer.removeCircle();
        //layer.printLayer();

        System.out.println("---------------------------------");
        System.out.println("Danh sach sau khi xoa la: ");

        diagram.getDiagram().add(layer);
        //diagram.removeCircle();
        diagram.sortLayer();
        diagram.printDiagram();

    }
}