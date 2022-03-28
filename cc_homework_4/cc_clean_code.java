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
public void determineGrade(double grade) throws GradeError{
  if (grade > 100) || (grade < 0) {
    throw new GradeError("Grades should be in the range 0-100.")
  } else {
    if (grade >= 80) {
      return 'A';
    } else if (grade >= 70) {
      return 'B';
    } else if (grade >= 60) {
      return 'C';
    } else if (grade >= 50) {
      return 'D';
    } else {
      return 'F';
    }
  }
}


// Don't Return Null



// Don't Pass Null


// BOUNDARIES

// Using Third-Party Code