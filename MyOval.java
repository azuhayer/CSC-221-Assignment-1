import javafx.scene.canvas.GraphicsContext;

public class MyOval extends MyShape {
    double height;
    double width;
    MyPoint center;
    MyColor color;
    double semiMajor;
    double semiMinor;

    //default constructor
    MyOval()
    {
        super(new MyPoint(), null);

        this.height = 0;
        this.width = 0;
        this.center = new MyPoint();
        this.semiMajor = 0;
        this.semiMinor = 0;
        this.color = MyColor.BLACK;
    }

    //Constructor with parameters
    MyOval(double height, double width, MyPoint center, MyColor color)
    {
        super(new MyPoint(), color);

        this.height = height;
        this.width = width;
        this.center = center;
        this.color = color;

        if((height < width))
        {
            this.semiMinor = height / 2;
            this.semiMajor = width / 2;
        }

        else
        {
            this.semiMinor = width / 2;
            this.semiMajor = height / 2;
        }

    }

    //Get Methods
    public MyPoint getCenter() { return center; }
    public double getMinorAxis() { return (width < height) ? width : height; }
    public double getMajorAxis() { return (width > height) ? width : height; }
    public MyColor getColor () { return color; }

    //Methods for Perimeter and Area
    @Override
    public double area() { return (Math.PI * (height / 2) * (width / 2)); }
    @Override
    public double perimeter() { return ((2 * Math.PI) * Math.sqrt((height * height + width * width) / 2)); }

    //Print Method
    @Override
    public String toString()
    {
        return 	"Semi Minor Length: " + semiMinor + "\n" +
                "Semi Major Length: " + semiMajor + "\n" +
                "Perimeter: " + perimeter() + "\n" +
                "Area: " + area() + "\n";
    }

    //Draw Method
    @Override
    public void draw (GraphicsContext GC)
    {
        GC.setFill(color.getColor());
        GC.fillOval(center.getX() - (width / 2), center.getY() - (height / 2), width, height);
    }
}
