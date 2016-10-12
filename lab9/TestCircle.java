// Space Monkey Mafia

import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class TestCircle extends TestCase {
  
  public static void main0(String args[]) {
  GeometricObject c1 = new Circle(69.0);
  System.out.println(c1);
  c1.getPerimeter();
  System.out.println(c1);
  c1.getArea();
  System.out.println(c1);
  
  }
  
}
