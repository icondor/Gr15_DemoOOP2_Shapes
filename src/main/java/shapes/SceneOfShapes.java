package shapes;

public class SceneOfShapes {

    private final int MAX=5;
    private MyShape[] shapes = new MyShape[MAX];
    private int index;

    public void addShape(MyShape genericShape) {
        shapes[index]=genericShape;
        index++;
    }

    public MyShape[] getShapes() {
        return shapes;
    }

    public void setShapes(MyShape[] shapes) {
        this.shapes = shapes;
    }
}
