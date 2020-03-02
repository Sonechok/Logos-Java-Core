public class Rectangle {
    private int length;
    private int width;

    public Rectangle()
    {
        this.length=10;
        this.width=5;
    }

    public  Rectangle(int length, int width)
    {
        this.length=length;
        this.width=width;
    }

    public int square()
    {
        return (length*width);
    }

    public int perimeter()
    {
        return ((length+width)*2);
    }
}
