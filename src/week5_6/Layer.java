package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer {
    private ArrayList<Shape> layer;
    private boolean visible;

    public Layer() {
        this.layer = new ArrayList<>();
        this.visible = true;
    }

    public Layer(ArrayList<Shape> layer){
        this();
        this.layer = layer;
    }

    public Layer(boolean visible) {
        this();
        this.visible = false;
    }

    public Layer(ArrayList<Shape> layer, boolean visible) {
        this(layer);
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }

    public void removeTriangle() {
        Iterator<Shape> iterator = layer.iterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (shape instanceof Triangle) {
                iterator.remove();
            }
        }
    }

    public void removeCircle() {
        Iterator<Shape> iterator = layer.iterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (shape instanceof Circle) {
                iterator.remove();
            }
        }
    }

    public void printLayer() {

        for (Shape shape : layer) {
            System.out.println(shape.toString());
        }
    }

    public void revomeDuplicated() {
        for (int i = 0; i < layer.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < layer.size(); j++) {
                if (layer.get(i).equals(layer.get(j))) {
                    count++;
                }
            }
            if (count > 0) layer.remove(i--);
        }
    }

}