package task4;

public class Rectangle implements iFigure {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }

    @Override
    public int perimeter() {
        return (this.width + this.height) * 2;
    }

}
