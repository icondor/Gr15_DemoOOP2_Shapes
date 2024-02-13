package shapes;

public class MyRectangle extends  MyShape{

    private MyPoint start;

    private int width;
    private int height;

    public MyPoint getStart() {
        return start;
    }

    public void setStart(MyPoint start) {
        this.start = start;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MyRectangle(MyPoint start, int width, int height) {
        this.start = start;
        this.width = width;
        this.height = height;
    }
}
