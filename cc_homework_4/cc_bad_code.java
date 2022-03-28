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

public void determineGrade(double grade) {
  if (grade > 100) || (grade < 0) {
    System.out.println("Grades should be in the range 0-100.");
  } else {
    if (grade >= 80) {
      return 'A';
    } else if (grade >= 70) {
      return 'B';
    } else if (grade >= 60) {
      return 'C';
    } else if (grade >= 50) {
      return 'D';
    } else if (grade < 50) {
      return 'F';
    }
  }
}


// Don't Return Null

// Don't Pass Null

// BOUNDARIES

// Using Third-Party Code