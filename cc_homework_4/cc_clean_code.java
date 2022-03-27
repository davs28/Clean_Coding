// OBJECTS AND DATA STRUCTURES

// Data Abstraction
public interface Battery {
  double getPercentageBatteryLeft();
}

// Data/Object Anti-Symmetry
public class Rectangle {
  private int length;
  private int width;

  public int area() {
    return length * width;
  }
}

public class Square {
  private int side;

  public int area() {
    return side * side;
  }
}

public class Circle {
  private double radius;
  public final double PI = 3.14159;

  public double area() {
    return PI * radius * radius;
  }
}

// The Law of Demeter
String roomNumber = room.level.number;


// ERROR HANDLING





// Use Exceptions Rather Than Return Codes

// Define Exception Classes in Terms of a Caller's Needs

// Define the Normal Flow

// Don't Return Null

// Don't Pass Null


// BOUNDARIES

// Using Third-Party Code