// Space Monkey Mafia

import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class TestResizableCircle extends TestCase {
  
  public static void main(String args[]) {
  Resizable c2 = new ResizableCircle(3.0);
  System.out.println(c2);
  c2.resize(40);
  System.out.println(c2);
  }
}
