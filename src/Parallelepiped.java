public class Parallelepiped {

    private int height;
    private int length;
    private int width;

    public Parallelepiped(int height, int length, int width) throws Exception {
        negativeNumber(height, length, width);
    }

    private void negativeNumber(int height, int length, int width) throws Exception {

        if ((height < 0 || length < 0 || width < 0) || height > 20 || length > 20 || width > 20) {
            throw new Exception();
        } else {
            this.height = height;
            this.length = length;
            this.width = width;
        }
    }
    
    public int area() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public int volume() {
        return (length * width * height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Parallelepiped:  " +
                "height: " + height +
                ", length: " + length +
                ", width: " + width;
    }
}
