
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}



public class Rectangle {

    private double length;
    private double breadth;

    // Default constructor
    public Rectangle() {
        // Default values
        this.length = 5.0;
        this.breadth = 5.0;
    }

    // Custom parameterized constructor
    public Rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Length and breadth must be positive numbers.");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to get the length
    public double getLength() {
        return length;
    }

    // Method to get the breadth
    public double getBreadth() {
        return breadth;
    }

    // Method to display information about the rectangle
    public void displayInfo() {
        System.out.println("Rectangle Information:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    
}

public class Sphere {

    private double radius;

    // Default constructor
    public Sphere() {
        // Default values
        this.radius = 0.0;
    }

    // Custom parameterized constructor
    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        this.radius = radius;
    }

    // Method to calculate the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

   
}



public class practice {

    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */


        // Problem 3
        // Rectangle r = new Rectangle(12, 56);
        // System.out.println(r.getLength());
        // System.out.println(r.getBreadth());

      //problem 4

        // Rectangle defaultRectangle = new Rectangle(); // Using default constructor
        // defaultRectangle.displayInfo();

        // Rectangle customRectangle = new Rectangle(8.0, 6.0); // Using custom parameters
        // customRectangle.displayInfo();
    
//problem 5
      
        Sphere mySphere = new Sphere(3.0); // Using custom constructor
        System.out.println("Radius: " + mySphere.getRadius());
        System.out.println("Volume: " + mySphere.calculateVolume());

        // Using setter method to change the radius
        mySphere.setRadius(5.0);
        System.out.println("New Radius: " + mySphere.getRadius());
        System.out.println("New Volume: " + mySphere.calculateVolume());
    




    }
}
