package week5_6;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> diagram;

    public Diagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
    }

    public Diagram() {
        diagram = new ArrayList<>();
    }

    public ArrayList<Layer> getDiagram() {
        return diagram;
    }

    public void setDiagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
    }

    // delete Circle in Diagram
    public void removeCircle() {
        for (int i = 0; i < diagram.size(); i++) {
            diagram.get(i).deleteCircle();
        }
    }

    public void printDiagram() {
        for (Layer layer : diagram) {
            if (layer.isVisible())
                layer.printLayer();
        }
    }

    public void sortLayer() {
        Layer circles = new Layer();
        Layer triangles = new Layer();
        Layer rectangles = new Layer();
        Layer squares = new Layer();
        Layer hexagons = new Layer();


        for (Layer layer : diagram) {
            for (Shape shape : layer.getLayer()) {
                if (shape instanceof Circle) circles.getLayer().add(shape);
                if (shape instanceof Triangle) triangles.getLayer().add(shape);
                if (shape instanceof Rectangle) rectangles.getLayer().add(shape);
                if (shape instanceof Square) squares.getLayer().add(shape);
                if (shape instanceof Hexagon) hexagons.getLayer().add(shape);

            }
        }
        diagram.clear();
        diagram.add(circles);
        diagram.add(triangles);
        diagram.add(rectangles);
        diagram.add(squares);
        diagram.add(hexagons);
    }
}