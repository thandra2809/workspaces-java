public class Rectangle {


    //state:
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // operations
    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    // to String override
    public String toString() {
        return String.format("Rectangle - length : %d, width : %d, area : %d, perimeter : %d",
                length,
                width,
                area(),
                perimeter());
    }
}
