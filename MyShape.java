public class MyShape {

    MyPoint p; // point p(x,y)
    MyColor color; //color of MyShape object

    //Default Constructor
    MyShape()
    {
        this.p = new MyPoint();
        this.color = MyColor.BLACK;
    }

    MyShape(MyPoint p, MyColor color)
    {
        setPoint(p);
        setColor(color);
    }


    //Set Methods
    public void setPoint(MyPoint p)
    {
        this.p = p;
    }
    public void setColor(MyColor color) { this.color = color; }

    //Get Methods
    public MyPoint getPoint() { return p; }
    public MyColor getColor() { return color; }

    public double getX() { return p.getX(); }
    public double getY() { return p.getY(); }


    public double area() { return 0; }
    public double perimeter() { return 0; }

    @Override
    public String toString()
    {
        return "This is an object of the MyShape class";
    }

    //Draw Method
    public void draw(GraphicsContext GC)
    {
        GC.setFill(color.getColor());
        GC.fillRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
    }
}
