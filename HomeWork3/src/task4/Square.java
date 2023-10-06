package task4;

public class Square implements iFigure {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return this.width * this.width;
    }

    @Override
    public int perimeter() {
        return this.width * 4;
    }

}
