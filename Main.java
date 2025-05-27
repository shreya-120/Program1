class RectangleArea {
    double length;
    double breadth;

    // Constructor
    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Display method
    public void displayArea() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

// RectanglePerimeter.java
class RectanglePerimeter {
    double length;
    double breadth;

    // Constructor
    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Display method
    public void displayPerimeter() {
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}public class Main {
    public static void main(String[] args) {
        // Rectangle for area
        RectangleArea areaRect = new RectangleArea(10, 5);
        areaRect.displayArea();

        // Rectangle for perimeter
        RectanglePerimeter perimeterRect = new RectanglePerimeter(10, 5);
        perimeterRect.displayPerimeter();

        // Simulate push to main branch
        System.out.println("Rectangle program pushed to main branch.");
    }
}


