// OBJECTS AND DATA STRUCTURES

// Data Abstraction
public interface Battery {
  double getBatteryCapacityInMah();
  double getCurrentBatteryLevel();
}

// Data/Object Anti-Symmetry
public class Rectangle {
  public int length;
  public int width;
}

public class Square {
  public int side;
}

public class Circle {
  public double radius;
}

public class Geometry {
  public final double PI = 3.14159;

  public double area(Object shape) {
    if (shape instanceof Square) {
      Square s = (Square) shape;
      return s.side * s.side;
    } else if (shape instanceof Rectangle) {
      Rectangle r = (Rectangle) shape;
      return r.height * r.width;
    } else if (shape instanceof Circle) {
      Circle c = (Circle) shape;
      return PI * c.radius * c.radius;
    }
  }
}

// The Law of Demeter
String roomNumber = room.getLevel().getNumber();


// Data Transfer Objects

// ERROR HANDLING

// Use Exceptions Rather Than Return Codes

// Define Exception Classes in Terms of a Caller's Needs

// Define the Normal Flow

// Don't Return Null

// Don't Pass Null

// BOUNDARIES

// Using Third-Party Code