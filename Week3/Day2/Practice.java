// Circle class
class Circle {
    // Fields
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder class inheriting from Circle
class Cylinder extends Circle {
    // Fields
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        // Call the constructor of the superclass (Circle)
        super(radius);
        this.height = height;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        // Use the method from the superclass (Circle) to get the base area
        double baseArea = super.calculateArea();
        // Calculate the volume of the cylinder
        return baseArea * height;
    }
}

// Rectangle class
class Rectangle {
    // Fields
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter methods for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getter and setter methods for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

// Cuboid class inheriting from Rectangle
class Cuboid extends Rectangle {
    // Field
    private double height;

    // Constructor
    public Cuboid(double length, double width, double height) {
        // Call the constructor of the superclass (Rectangle)
        super(length, width);
        this.height = height;
    }

    // Getter and setter methods for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cuboid
    public double calculateVolume() {
        // Use the method from the superclass (Rectangle) to get the base area
        double baseArea = super.calculateArea();
        // Calculate the volume of the cuboid
        return baseArea * height;
    }
}




// main class 
public class Practice {
    public static void main(String[] args) {
        // Create a Circle

      //problem 1 and 3
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Create a Cylinder
        Cylinder cylinder = new Cylinder(3.0, 8.0);
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());

//problem 2 nd 4
      
      // Create a Rectangle
      Rectangle rectangle = new Rectangle(4.0, 5.0);
      System.out.println("Rectangle Area: " + rectangle.calculateArea());

      // Create a Cuboid
      Cuboid cuboid = new Cuboid(3.0, 4.0, 5.0);
      System.out.println("Cuboid Volume: " + cuboid.calculateVolume());

      //problem 5 
      // the order of execution will be Base constructor, Derived1 constructor, and then Derived2 constructor.
    }
}

