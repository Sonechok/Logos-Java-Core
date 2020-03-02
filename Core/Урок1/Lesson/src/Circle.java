public class Circle {
    private float radius = 1;
    private float diameter;
    public Circle(float radius)
    {
        this.radius=radius;
        this.diameter=2*this.radius;
    }
    public double square()
    {
        return (((Math.PI)*diameter*diameter)/4);
    }
    public double length()
    {
        return (2*(Math.PI)*radius);
    }
}
