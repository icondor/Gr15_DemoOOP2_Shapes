package shapes;

public class HelloApplicationNoUI {

    public static void main(String[] args) {

        MyCircle circle1 = new MyCircle(new MyPoint(300,300), 100);
        MyCircle circle2 = new MyCircle(new MyPoint(100,200), 60);
        MyRectangle myR = new MyRectangle(new MyPoint(400,600), 150, 60);

        SceneOfShapes scene = new SceneOfShapes();

        scene.addShape(circle2);
        scene.addShape(myR);
        scene.addShape(circle1);

    }
}
